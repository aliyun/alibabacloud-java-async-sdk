// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateAssetSelectionConfigResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAssetSelectionConfigResponseBody</p>
 */
public class CreateAssetSelectionConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateAssetSelectionConfigResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAssetSelectionConfigResponseBody create() {
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
         * <p>The response parameters.</p>
         */
        public Builder data(Data data) {
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

        public CreateAssetSelectionConfigResponseBody build() {
            return new CreateAssetSelectionConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateAssetSelectionConfigResponseBody} extends {@link TeaModel}
     *
     * <p>CreateAssetSelectionConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BusinessType")
        private String businessType;

        @com.aliyun.core.annotation.NameInMap("SelectionKey")
        private Long selectionKey;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        private Data(Builder builder) {
            this.businessType = builder.businessType;
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
         * @return businessType
         */
        public String getBusinessType() {
            return this.businessType;
        }

        /**
         * @return selectionKey
         */
        public Long getSelectionKey() {
            return this.selectionKey;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        public static final class Builder {
            private String businessType; 
            private Long selectionKey; 
            private String targetType; 

            /**
             * <p>The business type that is selected for the asset. Valid values:</p>
             * <ul>
             * <li><strong>VIRUS_SCAN_CYCLE_CONFIG</strong>: virus detection configuration</li>
             * <li><strong>VIRUS_SCAN_ONCE_TASK</strong>: one-time scan for virus detection</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VIRUS_SCAN_CYCLE_CONFIG</p>
             */
            public Builder businessType(String businessType) {
                this.businessType = businessType;
                return this;
            }

            /**
             * <p>The ID of the current asset selection. It can be used to query and modify the asset that is selected.</p>
             * 
             * <strong>example:</strong>
             * <p>53e93435-d694-4c03-9ce7-da12bee1****</p>
             */
            public Builder selectionKey(Long selectionKey) {
                this.selectionKey = selectionKey;
                return this;
            }

            /**
             * <p>The dimension based on which the asset is selected. Valid values:</p>
             * <ul>
             * <li><strong>group</strong>: The asset is selected by server.</li>
             * <li><strong>group</strong>: The asset is selected by group.</li>
             * <li><strong>vpc</strong>: The asset is selected by VPC.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>group</p>
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
