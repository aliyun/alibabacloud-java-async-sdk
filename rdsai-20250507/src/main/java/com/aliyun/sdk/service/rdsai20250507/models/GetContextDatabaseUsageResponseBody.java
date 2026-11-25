// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetContextDatabaseUsageResponseBody} extends {@link TeaModel}
 *
 * <p>GetContextDatabaseUsageResponseBody</p>
 */
public class GetContextDatabaseUsageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Dimension")
    private String dimension;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private GetContextDatabaseUsageResponseBody(Builder builder) {
        this.dimension = builder.dimension;
        this.endTime = builder.endTime;
        this.items = builder.items;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetContextDatabaseUsageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dimension
     */
    public String getDimension() {
        return this.dimension;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private String dimension; 
        private String endTime; 
        private java.util.List<Items> items; 
        private String requestId; 
        private String startTime; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(GetContextDatabaseUsageResponseBody model) {
            this.dimension = model.dimension;
            this.endTime = model.endTime;
            this.items = model.items;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * <p>The query dimension. Valid values:</p>
         * <ul>
         * <li><code>Workspace</code>: A single workspace.</li>
         * <li><code>Account</code>: All workspaces under the caller account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Workspace</p>
         */
        public Builder dimension(String dimension) {
            this.dimension = dimension;
            return this;
        }

        /**
         * <p>The end time of the query range passed in the request, exclusive.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-01T00:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The usage list. It returns all seven metering items in a fixed order. If an item has no data within the query range, its usage is 0.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The ID of the API request. You can use the ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>00000000-0000-4000-8000-000000000001</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The start time of the query range passed in the request, inclusive.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-01T00:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The ID of the queried workspace. This field has a value only when <code>Dimension</code> is set to <code>Workspace</code>. It is empty for the account dimension.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-x9z4ctzed9gfu2w</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public GetContextDatabaseUsageResponseBody build() {
            return new GetContextDatabaseUsageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetContextDatabaseUsageResponseBody} extends {@link TeaModel}
     *
     * <p>GetContextDatabaseUsageResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Item")
        private String item;

        @com.aliyun.core.annotation.NameInMap("Quantity")
        private Long quantity;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        private Items(Builder builder) {
            this.item = builder.item;
            this.quantity = builder.quantity;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return item
         */
        public String getItem() {
            return this.item;
        }

        /**
         * @return quantity
         */
        public Long getQuantity() {
            return this.quantity;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private String item; 
            private Long quantity; 
            private String unit; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.item = model.item;
                this.quantity = model.quantity;
                this.unit = model.unit;
            } 

            /**
             * <p>The metering item.</p>
             * 
             * <strong>example:</strong>
             * <p>KnowledgeBaseRead</p>
             */
            public Builder item(String item) {
                this.item = item;
                return this;
            }

            /**
             * <p>The usage of the item within the query range. The unit is specified by <code>Unit</code>. The number of calls, tokens, and context evolutions are accumulated over the range. Storage is calculated by averaging the occupancy snapshots of each workspace within the range and rounding to the nearest integer byte. For the account dimension, the average values of all workspaces are summed.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder quantity(Long quantity) {
                this.quantity = quantity;
                return this;
            }

            /**
             * <p>The metering unit. Valid values:</p>
             * <ul>
             * <li><code>Count</code>: The number of calls.</li>
             * <li><code>Token</code>: The number of tokens.</li>
             * <li><code>MicroCredit</code>: One millionth of a credit.</li>
             * <li><code>Byte</code>: Bytes.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Count</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
