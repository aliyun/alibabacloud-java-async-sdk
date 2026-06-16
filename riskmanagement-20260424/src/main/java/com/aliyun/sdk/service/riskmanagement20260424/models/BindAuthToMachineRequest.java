// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.riskmanagement20260424.models;

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
 * {@link BindAuthToMachineRequest} extends {@link RequestModel}
 *
 * <p>BindAuthToMachineRequest</p>
 */
public class BindAuthToMachineRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SdkRequest")
    private SdkRequest sdkRequest;

    private BindAuthToMachineRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.sdkRequest = builder.sdkRequest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindAuthToMachineRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sdkRequest
     */
    public SdkRequest getSdkRequest() {
        return this.sdkRequest;
    }

    public static final class Builder extends Request.Builder<BindAuthToMachineRequest, Builder> {
        private String regionId; 
        private SdkRequest sdkRequest; 

        private Builder() {
            super();
        } 

        private Builder(BindAuthToMachineRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.sdkRequest = request.sdkRequest;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SdkRequest.
         */
        public Builder sdkRequest(SdkRequest sdkRequest) {
            String sdkRequestShrink = shrink(sdkRequest, "SdkRequest", "json");
            this.putQueryParameter("SdkRequest", sdkRequestShrink);
            this.sdkRequest = sdkRequest;
            return this;
        }

        @Override
        public BindAuthToMachineRequest build() {
            return new BindAuthToMachineRequest(this);
        } 

    } 

    /**
     * 
     * {@link BindAuthToMachineRequest} extends {@link TeaModel}
     *
     * <p>BindAuthToMachineRequest</p>
     */
    public static class SdkRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthVersion")
        private Integer authVersion;

        @com.aliyun.core.annotation.NameInMap("AutoBind")
        private Integer autoBind;

        @com.aliyun.core.annotation.NameInMap("Bind")
        private java.util.List<String> bind;

        @com.aliyun.core.annotation.NameInMap("BindAll")
        private Boolean bindAll;

        @com.aliyun.core.annotation.NameInMap("Criteria")
        private String criteria;

        @com.aliyun.core.annotation.NameInMap("IsPreBind")
        private Integer isPreBind;

        @com.aliyun.core.annotation.NameInMap("LogicalExp")
        private String logicalExp;

        @com.aliyun.core.annotation.NameInMap("NtmVersion")
        private Long ntmVersion;

        @com.aliyun.core.annotation.NameInMap("PreBindOrderId")
        private Long preBindOrderId;

        @com.aliyun.core.annotation.NameInMap("UnBind")
        private java.util.List<String> unBind;

        private SdkRequest(Builder builder) {
            this.authVersion = builder.authVersion;
            this.autoBind = builder.autoBind;
            this.bind = builder.bind;
            this.bindAll = builder.bindAll;
            this.criteria = builder.criteria;
            this.isPreBind = builder.isPreBind;
            this.logicalExp = builder.logicalExp;
            this.ntmVersion = builder.ntmVersion;
            this.preBindOrderId = builder.preBindOrderId;
            this.unBind = builder.unBind;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SdkRequest create() {
            return builder().build();
        }

        /**
         * @return authVersion
         */
        public Integer getAuthVersion() {
            return this.authVersion;
        }

        /**
         * @return autoBind
         */
        public Integer getAutoBind() {
            return this.autoBind;
        }

        /**
         * @return bind
         */
        public java.util.List<String> getBind() {
            return this.bind;
        }

        /**
         * @return bindAll
         */
        public Boolean getBindAll() {
            return this.bindAll;
        }

        /**
         * @return criteria
         */
        public String getCriteria() {
            return this.criteria;
        }

        /**
         * @return isPreBind
         */
        public Integer getIsPreBind() {
            return this.isPreBind;
        }

        /**
         * @return logicalExp
         */
        public String getLogicalExp() {
            return this.logicalExp;
        }

        /**
         * @return ntmVersion
         */
        public Long getNtmVersion() {
            return this.ntmVersion;
        }

        /**
         * @return preBindOrderId
         */
        public Long getPreBindOrderId() {
            return this.preBindOrderId;
        }

        /**
         * @return unBind
         */
        public java.util.List<String> getUnBind() {
            return this.unBind;
        }

        public static final class Builder {
            private Integer authVersion; 
            private Integer autoBind; 
            private java.util.List<String> bind; 
            private Boolean bindAll; 
            private String criteria; 
            private Integer isPreBind; 
            private String logicalExp; 
            private Long ntmVersion; 
            private Long preBindOrderId; 
            private java.util.List<String> unBind; 

            private Builder() {
            } 

            private Builder(SdkRequest model) {
                this.authVersion = model.authVersion;
                this.autoBind = model.autoBind;
                this.bind = model.bind;
                this.bindAll = model.bindAll;
                this.criteria = model.criteria;
                this.isPreBind = model.isPreBind;
                this.logicalExp = model.logicalExp;
                this.ntmVersion = model.ntmVersion;
                this.preBindOrderId = model.preBindOrderId;
                this.unBind = model.unBind;
            } 

            /**
             * AuthVersion.
             */
            public Builder authVersion(Integer authVersion) {
                this.authVersion = authVersion;
                return this;
            }

            /**
             * AutoBind.
             */
            public Builder autoBind(Integer autoBind) {
                this.autoBind = autoBind;
                return this;
            }

            /**
             * Bind.
             */
            public Builder bind(java.util.List<String> bind) {
                this.bind = bind;
                return this;
            }

            /**
             * BindAll.
             */
            public Builder bindAll(Boolean bindAll) {
                this.bindAll = bindAll;
                return this;
            }

            /**
             * Criteria.
             */
            public Builder criteria(String criteria) {
                this.criteria = criteria;
                return this;
            }

            /**
             * IsPreBind.
             */
            public Builder isPreBind(Integer isPreBind) {
                this.isPreBind = isPreBind;
                return this;
            }

            /**
             * LogicalExp.
             */
            public Builder logicalExp(String logicalExp) {
                this.logicalExp = logicalExp;
                return this;
            }

            /**
             * NtmVersion.
             */
            public Builder ntmVersion(Long ntmVersion) {
                this.ntmVersion = ntmVersion;
                return this;
            }

            /**
             * PreBindOrderId.
             */
            public Builder preBindOrderId(Long preBindOrderId) {
                this.preBindOrderId = preBindOrderId;
                return this;
            }

            /**
             * UnBind.
             */
            public Builder unBind(java.util.List<String> unBind) {
                this.unBind = unBind;
                return this;
            }

            public SdkRequest build() {
                return new SdkRequest(this);
            } 

        } 

    }
}
