// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListImageBuildRiskItemResponseBody} extends {@link TeaModel}
 *
 * <p>ListImageBuildRiskItemResponseBody</p>
 */
public class ListImageBuildRiskItemResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListImageBuildRiskItemResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListImageBuildRiskItemResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListImageBuildRiskItemResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response parameters.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A3D7C47D-3F11-57BB-90E8-E5C20C619F37</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListImageBuildRiskItemResponseBody build() {
            return new ListImageBuildRiskItemResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListImageBuildRiskItemResponseBody} extends {@link TeaModel}
     *
     * <p>ListImageBuildRiskItemResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ItemKey")
        private String itemKey;

        @com.aliyun.core.annotation.NameInMap("ItemName")
        private String itemName;

        private Data(Builder builder) {
            this.itemKey = builder.itemKey;
            this.itemName = builder.itemName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return itemKey
         */
        public String getItemKey() {
            return this.itemKey;
        }

        /**
         * @return itemName
         */
        public String getItemName() {
            return this.itemName;
        }

        public static final class Builder {
            private String itemKey; 
            private String itemName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.itemKey = model.itemKey;
                this.itemName = model.itemName;
            } 

            /**
             * <p>The type key of the risky build command.</p>
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder itemKey(String itemKey) {
                this.itemKey = itemKey;
                return this;
            }

            /**
             * <p>The type name of the risky build command.</p>
             * 
             * <strong>example:</strong>
             * <p>itemName.</p>
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
