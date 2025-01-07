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
 * {@link GetAssetSelectionConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetAssetSelectionConfigResponseBody</p>
 */
public class GetAssetSelectionConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAssetSelectionConfigResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAssetSelectionConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C5936B67-3EDF-53ED-A542-02543972449A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAssetSelectionConfigResponseBody build() {
            return new GetAssetSelectionConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAssetSelectionConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetAssetSelectionConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("SelectionKey")
        private String selectionKey;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        private Data(Builder builder) {
            this.platform = builder.platform;
            this.selectionKey = builder.selectionKey;
            this.targetType = builder.targetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return selectionKey
         */
        public String getSelectionKey() {
            return this.selectionKey;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        public static final class Builder {
            private String platform; 
            private String selectionKey; 
            private String targetType; 

            /**
             * <p>The operating system of the asset. Valid values:</p>
             * <ul>
             * <li><strong>windows</strong></li>
             * <li><strong>linux</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>linux</p>
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * <p>The ID of the current asset selection. It can be used to query and modify the asset that is selected.</p>
             * 
             * <strong>example:</strong>
             * <p>657c8411-4e89-446c-ab66-d45d1331****</p>
             */
            public Builder selectionKey(String selectionKey) {
                this.selectionKey = selectionKey;
                return this;
            }

            /**
             * <p>The dimension based on which the asset is selected. Valid values:</p>
             * <ul>
             * <li><strong>instance</strong>: The asset is selected by server.</li>
             * <li><strong>group</strong>: The asset is selected by group.</li>
             * <li><strong>vpc</strong>: The asset is selected by VPC.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>instance</p>
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
