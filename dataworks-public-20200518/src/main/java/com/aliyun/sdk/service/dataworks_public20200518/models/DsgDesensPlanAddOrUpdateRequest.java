// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DsgDesensPlanAddOrUpdateRequest} extends {@link RequestModel}
 *
 * <p>DsgDesensPlanAddOrUpdateRequest</p>
 */
public class DsgDesensPlanAddOrUpdateRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesensRules")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < DesensRules> desensRules;

    private DsgDesensPlanAddOrUpdateRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.desensRules = builder.desensRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DsgDesensPlanAddOrUpdateRequest create() {
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
     * @return desensRules
     */
    public java.util.List < DesensRules> getDesensRules() {
        return this.desensRules;
    }

    public static final class Builder extends Request.Builder<DsgDesensPlanAddOrUpdateRequest, Builder> {
        private String regionId; 
        private java.util.List < DesensRules> desensRules; 

        private Builder() {
            super();
        } 

        private Builder(DsgDesensPlanAddOrUpdateRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.desensRules = request.desensRules;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * DesensRules.
         */
        public Builder desensRules(java.util.List < DesensRules> desensRules) {
            String desensRulesShrink = shrink(desensRules, "DesensRules", "json");
            this.putQueryParameter("DesensRules", desensRulesShrink);
            this.desensRules = desensRules;
            return this;
        }

        @Override
        public DsgDesensPlanAddOrUpdateRequest build() {
            return new DsgDesensPlanAddOrUpdateRequest(this);
        } 

    } 

    public static class DesensPlan extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DesensPlanType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String desensPlanType;

        @com.aliyun.core.annotation.NameInMap("ExtParam")
        private java.util.Map < String, ? > extParam;

        private DesensPlan(Builder builder) {
            this.desensPlanType = builder.desensPlanType;
            this.extParam = builder.extParam;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DesensPlan create() {
            return builder().build();
        }

        /**
         * @return desensPlanType
         */
        public String getDesensPlanType() {
            return this.desensPlanType;
        }

        /**
         * @return extParam
         */
        public java.util.Map < String, ? > getExtParam() {
            return this.extParam;
        }

        public static final class Builder {
            private String desensPlanType; 
            private java.util.Map < String, ? > extParam; 

            /**
             * DesensPlanType.
             */
            public Builder desensPlanType(String desensPlanType) {
                this.desensPlanType = desensPlanType;
                return this;
            }

            /**
             * ExtParam.
             */
            public Builder extParam(java.util.Map < String, ? > extParam) {
                this.extParam = extParam;
                return this;
            }

            public DesensPlan build() {
                return new DesensPlan(this);
            } 

        } 

    }
    public static class DesensRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckWatermark")
        private Boolean checkWatermark;

        @com.aliyun.core.annotation.NameInMap("DataType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String dataType;

        @com.aliyun.core.annotation.NameInMap("DesensPlan")
        @com.aliyun.core.annotation.Validation(required = true)
        private DesensPlan desensPlan;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("Owner")
        @com.aliyun.core.annotation.Validation(required = true)
        private String owner;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("SceneIds")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < Integer > sceneIds;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private DesensRules(Builder builder) {
            this.checkWatermark = builder.checkWatermark;
            this.dataType = builder.dataType;
            this.desensPlan = builder.desensPlan;
            this.id = builder.id;
            this.owner = builder.owner;
            this.ruleName = builder.ruleName;
            this.sceneIds = builder.sceneIds;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DesensRules create() {
            return builder().build();
        }

        /**
         * @return checkWatermark
         */
        public Boolean getCheckWatermark() {
            return this.checkWatermark;
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return desensPlan
         */
        public DesensPlan getDesensPlan() {
            return this.desensPlan;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return sceneIds
         */
        public java.util.List < Integer > getSceneIds() {
            return this.sceneIds;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Boolean checkWatermark; 
            private String dataType; 
            private DesensPlan desensPlan; 
            private Integer id; 
            private String owner; 
            private String ruleName; 
            private java.util.List < Integer > sceneIds; 
            private Integer status; 

            /**
             * CheckWatermark.
             */
            public Builder checkWatermark(Boolean checkWatermark) {
                this.checkWatermark = checkWatermark;
                return this;
            }

            /**
             * DataType.
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * DesensPlan.
             */
            public Builder desensPlan(DesensPlan desensPlan) {
                this.desensPlan = desensPlan;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * SceneIds.
             */
            public Builder sceneIds(java.util.List < Integer > sceneIds) {
                this.sceneIds = sceneIds;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public DesensRules build() {
                return new DesensRules(this);
            } 

        } 

    }
}
