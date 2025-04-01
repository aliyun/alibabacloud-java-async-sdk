// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link CreateComputeQuotaPlanRequest} extends {@link RequestModel}
 *
 * <p>CreateComputeQuotaPlanRequest</p>
 */
public class CreateComputeQuotaPlanRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("nickname")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nickname;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("quota")
    private Quota quota;

    private CreateComputeQuotaPlanRequest(Builder builder) {
        super(builder);
        this.nickname = builder.nickname;
        this.name = builder.name;
        this.quota = builder.quota;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateComputeQuotaPlanRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nickname
     */
    public String getNickname() {
        return this.nickname;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return quota
     */
    public Quota getQuota() {
        return this.quota;
    }

    public static final class Builder extends Request.Builder<CreateComputeQuotaPlanRequest, Builder> {
        private String nickname; 
        private String name; 
        private Quota quota; 

        private Builder() {
            super();
        } 

        private Builder(CreateComputeQuotaPlanRequest request) {
            super(request);
            this.nickname = request.nickname;
            this.name = request.name;
            this.quota = request.quota;
        } 

        /**
         * <p>The nickname of level-1 compute quota.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>os_ComputeQuota_p</p>
         */
        public Builder nickname(String nickname) {
            this.putPathParameter("nickname", nickname);
            this.nickname = nickname;
            return this;
        }

        /**
         * <p>The name of quota plan.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>planA</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The parameters of quota plan.</p>
         */
        public Builder quota(Quota quota) {
            this.putBodyParameter("quota", quota);
            this.quota = quota;
            return this;
        }

        @Override
        public CreateComputeQuotaPlanRequest build() {
            return new CreateComputeQuotaPlanRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateComputeQuotaPlanRequest} extends {@link TeaModel}
     *
     * <p>CreateComputeQuotaPlanRequest</p>
     */
    public static class Parameter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("elasticReservedCU")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long elasticReservedCU;

        private Parameter(Builder builder) {
            this.elasticReservedCU = builder.elasticReservedCU;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameter create() {
            return builder().build();
        }

        /**
         * @return elasticReservedCU
         */
        public Long getElasticReservedCU() {
            return this.elasticReservedCU;
        }

        public static final class Builder {
            private Long elasticReservedCU; 

            private Builder() {
            } 

            private Builder(Parameter model) {
                this.elasticReservedCU = model.elasticReservedCU;
            } 

            /**
             * <p>The value of elastic Reserved CUs in the level-1 quota.</p>
             * <blockquote>
             * <p>The default value is 0. The maximum value of this parameter must be equal to the number of subscription-based reserved CUs and cannot exceed 10,000 CUs.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder elasticReservedCU(Long elasticReservedCU) {
                this.elasticReservedCU = elasticReservedCU;
                return this;
            }

            public Parameter build() {
                return new Parameter(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateComputeQuotaPlanRequest} extends {@link TeaModel}
     *
     * <p>CreateComputeQuotaPlanRequest</p>
     */
    public static class SubQuotaInfoListParameter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("elasticReservedCU")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long elasticReservedCU;

        @com.aliyun.core.annotation.NameInMap("maxCU")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long maxCU;

        @com.aliyun.core.annotation.NameInMap("minCU")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long minCU;

        private SubQuotaInfoListParameter(Builder builder) {
            this.elasticReservedCU = builder.elasticReservedCU;
            this.maxCU = builder.maxCU;
            this.minCU = builder.minCU;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubQuotaInfoListParameter create() {
            return builder().build();
        }

        /**
         * @return elasticReservedCU
         */
        public Long getElasticReservedCU() {
            return this.elasticReservedCU;
        }

        /**
         * @return maxCU
         */
        public Long getMaxCU() {
            return this.maxCU;
        }

        /**
         * @return minCU
         */
        public Long getMinCU() {
            return this.minCU;
        }

        public static final class Builder {
            private Long elasticReservedCU; 
            private Long maxCU; 
            private Long minCU; 

            private Builder() {
            } 

            private Builder(SubQuotaInfoListParameter model) {
                this.elasticReservedCU = model.elasticReservedCU;
                this.maxCU = model.maxCU;
                this.minCU = model.minCU;
            } 

            /**
             * <p>The value of elastic Reserved CUs.</p>
             * <blockquote>
             * <p>The total number of elastically reserved CUs in all the level-2 quotas is equal to the number of elastically reserved CUs in the level-1 quota.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder elasticReservedCU(Long elasticReservedCU) {
                this.elasticReservedCU = elasticReservedCU;
                return this;
            }

            /**
             * <p>The value of maxCU in Reserved CUs.</p>
             * <blockquote>
             * <p>The value of maxCU must be less than or equal to the value of maxCU in the level-1 quota that you purchased.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder maxCU(Long maxCU) {
                this.maxCU = maxCU;
                return this;
            }

            /**
             * <p>The value of minCU in Reserved CUs.</p>
             * <blockquote>
             * <ul>
             * <li>The total value of minCU in all the level-2 quotas is equal to the value of minCU in the level-1 quota.</li>
             * <li>The value of minCU must be less than or equal to the value of maxCU in the level-2 quota and less than or equal to the value of minCU in the level-1 quota that you purchased.</li>
             * </ul>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder minCU(Long minCU) {
                this.minCU = minCU;
                return this;
            }

            public SubQuotaInfoListParameter build() {
                return new SubQuotaInfoListParameter(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateComputeQuotaPlanRequest} extends {@link TeaModel}
     *
     * <p>CreateComputeQuotaPlanRequest</p>
     */
    public static class SubQuotaInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("nickName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String nickName;

        @com.aliyun.core.annotation.NameInMap("parameter")
        private SubQuotaInfoListParameter parameter;

        private SubQuotaInfoList(Builder builder) {
            this.nickName = builder.nickName;
            this.parameter = builder.parameter;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubQuotaInfoList create() {
            return builder().build();
        }

        /**
         * @return nickName
         */
        public String getNickName() {
            return this.nickName;
        }

        /**
         * @return parameter
         */
        public SubQuotaInfoListParameter getParameter() {
            return this.parameter;
        }

        public static final class Builder {
            private String nickName; 
            private SubQuotaInfoListParameter parameter; 

            private Builder() {
            } 

            private Builder(SubQuotaInfoList model) {
                this.nickName = model.nickName;
                this.parameter = model.parameter;
            } 

            /**
             * <p>The nickname of the level-2 quota.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>os_ComputeQuota</p>
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * <p>The parameters of the level-2 quota.</p>
             */
            public Builder parameter(SubQuotaInfoListParameter parameter) {
                this.parameter = parameter;
                return this;
            }

            public SubQuotaInfoList build() {
                return new SubQuotaInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateComputeQuotaPlanRequest} extends {@link TeaModel}
     *
     * <p>CreateComputeQuotaPlanRequest</p>
     */
    public static class Quota extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("parameter")
        private Parameter parameter;

        @com.aliyun.core.annotation.NameInMap("subQuotaInfoList")
        private java.util.List<SubQuotaInfoList> subQuotaInfoList;

        private Quota(Builder builder) {
            this.parameter = builder.parameter;
            this.subQuotaInfoList = builder.subQuotaInfoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Quota create() {
            return builder().build();
        }

        /**
         * @return parameter
         */
        public Parameter getParameter() {
            return this.parameter;
        }

        /**
         * @return subQuotaInfoList
         */
        public java.util.List<SubQuotaInfoList> getSubQuotaInfoList() {
            return this.subQuotaInfoList;
        }

        public static final class Builder {
            private Parameter parameter; 
            private java.util.List<SubQuotaInfoList> subQuotaInfoList; 

            private Builder() {
            } 

            private Builder(Quota model) {
                this.parameter = model.parameter;
                this.subQuotaInfoList = model.subQuotaInfoList;
            } 

            /**
             * <p>The parameters of level-1 quota.</p>
             */
            public Builder parameter(Parameter parameter) {
                this.parameter = parameter;
                return this;
            }

            /**
             * <p>The list of level-2 quotas.</p>
             */
            public Builder subQuotaInfoList(java.util.List<SubQuotaInfoList> subQuotaInfoList) {
                this.subQuotaInfoList = subQuotaInfoList;
                return this;
            }

            public Quota build() {
                return new Quota(this);
            } 

        } 

    }
}
