// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AuditItemSubmitRequest} extends {@link RequestModel}
 *
 * <p>AuditItemSubmitRequest</p>
 */
public class AuditItemSubmitRequest extends Request {
    @Query
    @NameInMap("Data")
    private java.util.List < Data> data;

    private AuditItemSubmitRequest(Builder builder) {
        super(builder);
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuditItemSubmitRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    public static final class Builder extends Request.Builder<AuditItemSubmitRequest, Builder> {
        private java.util.List < Data> data; 

        private Builder() {
            super();
        } 

        private Builder(AuditItemSubmitRequest request) {
            super(request);
            this.data = request.data;
        } 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.putQueryParameter("Data", data);
            this.data = data;
            return this;
        }

        @Override
        public AuditItemSubmitRequest build() {
            return new AuditItemSubmitRequest(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CustomResult")
        private String customResult;

        @NameInMap("CustomRiskType")
        private String customRiskType;

        @NameInMap("Id")
        private Long id;

        private Data(Builder builder) {
            this.customResult = builder.customResult;
            this.customRiskType = builder.customRiskType;
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return customResult
         */
        public String getCustomResult() {
            return this.customResult;
        }

        /**
         * @return customRiskType
         */
        public String getCustomRiskType() {
            return this.customRiskType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        public static final class Builder {
            private String customResult; 
            private String customRiskType; 
            private Long id; 

            /**
             * CustomResult.
             */
            public Builder customResult(String customResult) {
                this.customResult = customResult;
                return this;
            }

            /**
             * CustomRiskType.
             */
            public Builder customRiskType(String customRiskType) {
                this.customRiskType = customRiskType;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
