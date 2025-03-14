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
 * {@link ListAssetSelectionSelectedTargetResponseBody} extends {@link TeaModel}
 *
 * <p>ListAssetSelectionSelectedTargetResponseBody</p>
 */
public class ListAssetSelectionSelectedTargetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

        private Builder(ListAssetSelectionSelectedTargetResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1EB12F73-6828-59D2-9FBF-F3713FD55128</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAssetSelectionSelectedTargetResponseBody build() {
            return new ListAssetSelectionSelectedTargetResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAssetSelectionSelectedTargetResponseBody} extends {@link TeaModel}
     *
     * <p>ListAssetSelectionSelectedTargetResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TargetId")
        private String targetId;

        @com.aliyun.core.annotation.NameInMap("TargetName")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.targetId = model.targetId;
                this.targetName = model.targetName;
            } 

            /**
             * <p>The ID of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>30****</p>
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * <p>The name of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>jen****</p>
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
