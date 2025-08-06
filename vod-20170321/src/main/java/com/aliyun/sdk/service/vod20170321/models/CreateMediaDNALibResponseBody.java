// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link CreateMediaDNALibResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMediaDNALibResponseBody</p>
 */
public class CreateMediaDNALibResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AIDNALibInfo")
    private AIDNALibInfo AIDNALibInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateMediaDNALibResponseBody(Builder builder) {
        this.AIDNALibInfo = builder.AIDNALibInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMediaDNALibResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return AIDNALibInfo
     */
    public AIDNALibInfo getAIDNALibInfo() {
        return this.AIDNALibInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AIDNALibInfo AIDNALibInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateMediaDNALibResponseBody model) {
            this.AIDNALibInfo = model.AIDNALibInfo;
            this.requestId = model.requestId;
        } 

        /**
         * AIDNALibInfo.
         */
        public Builder AIDNALibInfo(AIDNALibInfo AIDNALibInfo) {
            this.AIDNALibInfo = AIDNALibInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateMediaDNALibResponseBody build() {
            return new CreateMediaDNALibResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateMediaDNALibResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMediaDNALibResponseBody</p>
     */
    public static class AIDNALibInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FpDBId")
        private String fpDBId;

        @com.aliyun.core.annotation.NameInMap("ModelType")
        private String modelType;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        private AIDNALibInfo(Builder builder) {
            this.fpDBId = builder.fpDBId;
            this.modelType = builder.modelType;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AIDNALibInfo create() {
            return builder().build();
        }

        /**
         * @return fpDBId
         */
        public String getFpDBId() {
            return this.fpDBId;
        }

        /**
         * @return modelType
         */
        public String getModelType() {
            return this.modelType;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String fpDBId; 
            private String modelType; 
            private String state; 

            private Builder() {
            } 

            private Builder(AIDNALibInfo model) {
                this.fpDBId = model.fpDBId;
                this.modelType = model.modelType;
                this.state = model.state;
            } 

            /**
             * FpDBId.
             */
            public Builder fpDBId(String fpDBId) {
                this.fpDBId = fpDBId;
                return this;
            }

            /**
             * ModelType.
             */
            public Builder modelType(String modelType) {
                this.modelType = modelType;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public AIDNALibInfo build() {
                return new AIDNALibInfo(this);
            } 

        } 

    }
}
