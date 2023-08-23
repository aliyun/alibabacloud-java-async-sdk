// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAssetSelectionSelectedTargetResponseBody} extends {@link TeaModel}
 *
 * <p>ListAssetSelectionSelectedTargetResponseBody</p>
 */
public class ListAssetSelectionSelectedTargetResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    private ListAssetSelectionSelectedTargetResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAssetSelectionSelectedTargetResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * The data returned.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAssetSelectionSelectedTargetResponseBody build() {
            return new ListAssetSelectionSelectedTargetResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("TargetId")
        private String targetId;

        @NameInMap("TargetName")
        private String targetName;

        private Data(Builder builder) {
            this.targetId = builder.targetId;
            this.targetName = builder.targetName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return targetId
         */
        public String getTargetId() {
            return this.targetId;
        }

        /**
         * @return targetName
         */
        public String getTargetName() {
            return this.targetName;
        }

        public static final class Builder {
            private String targetId; 
            private String targetName; 

            /**
             * The ID of the asset.
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * The name of the asset.
             */
            public Builder targetName(String targetName) {
                this.targetName = targetName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
