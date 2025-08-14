// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20230930.models;

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
 * {@link SaveCostCenterShareRuleRequest} extends {@link RequestModel}
 *
 * <p>SaveCostCenterShareRuleRequest</p>
 */
public class SaveCostCenterShareRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateShareRuleList")
    private java.util.List<CreateShareRuleList> createShareRuleList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModifyShareRuleList")
    private java.util.List<ModifyShareRuleList> modifyShareRuleList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Nbid")
    private String nbid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccountId")
    private Long ownerAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemoveShareRuleList")
    private java.util.List<Long> removeShareRuleList;

    private SaveCostCenterShareRuleRequest(Builder builder) {
        super(builder);
        this.createShareRuleList = builder.createShareRuleList;
        this.modifyShareRuleList = builder.modifyShareRuleList;
        this.nbid = builder.nbid;
        this.ownerAccountId = builder.ownerAccountId;
        this.removeShareRuleList = builder.removeShareRuleList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveCostCenterShareRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createShareRuleList
     */
    public java.util.List<CreateShareRuleList> getCreateShareRuleList() {
        return this.createShareRuleList;
    }

    /**
     * @return modifyShareRuleList
     */
    public java.util.List<ModifyShareRuleList> getModifyShareRuleList() {
        return this.modifyShareRuleList;
    }

    /**
     * @return nbid
     */
    public String getNbid() {
        return this.nbid;
    }

    /**
     * @return ownerAccountId
     */
    public Long getOwnerAccountId() {
        return this.ownerAccountId;
    }

    /**
     * @return removeShareRuleList
     */
    public java.util.List<Long> getRemoveShareRuleList() {
        return this.removeShareRuleList;
    }

    public static final class Builder extends Request.Builder<SaveCostCenterShareRuleRequest, Builder> {
        private java.util.List<CreateShareRuleList> createShareRuleList; 
        private java.util.List<ModifyShareRuleList> modifyShareRuleList; 
        private String nbid; 
        private Long ownerAccountId; 
        private java.util.List<Long> removeShareRuleList; 

        private Builder() {
            super();
        } 

        private Builder(SaveCostCenterShareRuleRequest request) {
            super(request);
            this.createShareRuleList = request.createShareRuleList;
            this.modifyShareRuleList = request.modifyShareRuleList;
            this.nbid = request.nbid;
            this.ownerAccountId = request.ownerAccountId;
            this.removeShareRuleList = request.removeShareRuleList;
        } 

        /**
         * CreateShareRuleList.
         */
        public Builder createShareRuleList(java.util.List<CreateShareRuleList> createShareRuleList) {
            String createShareRuleListShrink = shrink(createShareRuleList, "CreateShareRuleList", "json");
            this.putQueryParameter("CreateShareRuleList", createShareRuleListShrink);
            this.createShareRuleList = createShareRuleList;
            return this;
        }

        /**
         * ModifyShareRuleList.
         */
        public Builder modifyShareRuleList(java.util.List<ModifyShareRuleList> modifyShareRuleList) {
            String modifyShareRuleListShrink = shrink(modifyShareRuleList, "ModifyShareRuleList", "json");
            this.putQueryParameter("ModifyShareRuleList", modifyShareRuleListShrink);
            this.modifyShareRuleList = modifyShareRuleList;
            return this;
        }

        /**
         * Nbid.
         */
        public Builder nbid(String nbid) {
            this.putQueryParameter("Nbid", nbid);
            this.nbid = nbid;
            return this;
        }

        /**
         * OwnerAccountId.
         */
        public Builder ownerAccountId(Long ownerAccountId) {
            this.putQueryParameter("OwnerAccountId", ownerAccountId);
            this.ownerAccountId = ownerAccountId;
            return this;
        }

        /**
         * RemoveShareRuleList.
         */
        public Builder removeShareRuleList(java.util.List<Long> removeShareRuleList) {
            String removeShareRuleListShrink = shrink(removeShareRuleList, "RemoveShareRuleList", "json");
            this.putQueryParameter("RemoveShareRuleList", removeShareRuleListShrink);
            this.removeShareRuleList = removeShareRuleList;
            return this;
        }

        @Override
        public SaveCostCenterShareRuleRequest build() {
            return new SaveCostCenterShareRuleRequest(this);
        } 

    } 

    /**
     * 
     * {@link SaveCostCenterShareRuleRequest} extends {@link TeaModel}
     *
     * <p>SaveCostCenterShareRuleRequest</p>
     */
    public static class CreateShareRuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FromCostCenterList")
        private java.util.List<Long> fromCostCenterList;

        @com.aliyun.core.annotation.NameInMap("ShareRatioList")
        private java.util.List<Double> shareRatioList;

        @com.aliyun.core.annotation.NameInMap("ShareRuleName")
        private String shareRuleName;

        @com.aliyun.core.annotation.NameInMap("ShareType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String shareType;

        @com.aliyun.core.annotation.NameInMap("ToCostCenterList")
        private java.util.List<Long> toCostCenterList;

        private CreateShareRuleList(Builder builder) {
            this.fromCostCenterList = builder.fromCostCenterList;
            this.shareRatioList = builder.shareRatioList;
            this.shareRuleName = builder.shareRuleName;
            this.shareType = builder.shareType;
            this.toCostCenterList = builder.toCostCenterList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateShareRuleList create() {
            return builder().build();
        }

        /**
         * @return fromCostCenterList
         */
        public java.util.List<Long> getFromCostCenterList() {
            return this.fromCostCenterList;
        }

        /**
         * @return shareRatioList
         */
        public java.util.List<Double> getShareRatioList() {
            return this.shareRatioList;
        }

        /**
         * @return shareRuleName
         */
        public String getShareRuleName() {
            return this.shareRuleName;
        }

        /**
         * @return shareType
         */
        public String getShareType() {
            return this.shareType;
        }

        /**
         * @return toCostCenterList
         */
        public java.util.List<Long> getToCostCenterList() {
            return this.toCostCenterList;
        }

        public static final class Builder {
            private java.util.List<Long> fromCostCenterList; 
            private java.util.List<Double> shareRatioList; 
            private String shareRuleName; 
            private String shareType; 
            private java.util.List<Long> toCostCenterList; 

            private Builder() {
            } 

            private Builder(CreateShareRuleList model) {
                this.fromCostCenterList = model.fromCostCenterList;
                this.shareRatioList = model.shareRatioList;
                this.shareRuleName = model.shareRuleName;
                this.shareType = model.shareType;
                this.toCostCenterList = model.toCostCenterList;
            } 

            /**
             * FromCostCenterList.
             */
            public Builder fromCostCenterList(java.util.List<Long> fromCostCenterList) {
                this.fromCostCenterList = fromCostCenterList;
                return this;
            }

            /**
             * ShareRatioList.
             */
            public Builder shareRatioList(java.util.List<Double> shareRatioList) {
                this.shareRatioList = shareRatioList;
                return this;
            }

            /**
             * ShareRuleName.
             */
            public Builder shareRuleName(String shareRuleName) {
                this.shareRuleName = shareRuleName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>RATIO</p>
             */
            public Builder shareType(String shareType) {
                this.shareType = shareType;
                return this;
            }

            /**
             * ToCostCenterList.
             */
            public Builder toCostCenterList(java.util.List<Long> toCostCenterList) {
                this.toCostCenterList = toCostCenterList;
                return this;
            }

            public CreateShareRuleList build() {
                return new CreateShareRuleList(this);
            } 

        } 

    }
    /**
     * 
     * {@link SaveCostCenterShareRuleRequest} extends {@link TeaModel}
     *
     * <p>SaveCostCenterShareRuleRequest</p>
     */
    public static class ModifyShareRuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FromCostCenterList")
        private java.util.List<Long> fromCostCenterList;

        @com.aliyun.core.annotation.NameInMap("ShareRatioList")
        private java.util.List<Double> shareRatioList;

        @com.aliyun.core.annotation.NameInMap("ShareRuleId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long shareRuleId;

        @com.aliyun.core.annotation.NameInMap("ShareRuleName")
        private String shareRuleName;

        @com.aliyun.core.annotation.NameInMap("ShareType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String shareType;

        @com.aliyun.core.annotation.NameInMap("ToCostCenterList")
        private java.util.List<Long> toCostCenterList;

        private ModifyShareRuleList(Builder builder) {
            this.fromCostCenterList = builder.fromCostCenterList;
            this.shareRatioList = builder.shareRatioList;
            this.shareRuleId = builder.shareRuleId;
            this.shareRuleName = builder.shareRuleName;
            this.shareType = builder.shareType;
            this.toCostCenterList = builder.toCostCenterList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModifyShareRuleList create() {
            return builder().build();
        }

        /**
         * @return fromCostCenterList
         */
        public java.util.List<Long> getFromCostCenterList() {
            return this.fromCostCenterList;
        }

        /**
         * @return shareRatioList
         */
        public java.util.List<Double> getShareRatioList() {
            return this.shareRatioList;
        }

        /**
         * @return shareRuleId
         */
        public Long getShareRuleId() {
            return this.shareRuleId;
        }

        /**
         * @return shareRuleName
         */
        public String getShareRuleName() {
            return this.shareRuleName;
        }

        /**
         * @return shareType
         */
        public String getShareType() {
            return this.shareType;
        }

        /**
         * @return toCostCenterList
         */
        public java.util.List<Long> getToCostCenterList() {
            return this.toCostCenterList;
        }

        public static final class Builder {
            private java.util.List<Long> fromCostCenterList; 
            private java.util.List<Double> shareRatioList; 
            private Long shareRuleId; 
            private String shareRuleName; 
            private String shareType; 
            private java.util.List<Long> toCostCenterList; 

            private Builder() {
            } 

            private Builder(ModifyShareRuleList model) {
                this.fromCostCenterList = model.fromCostCenterList;
                this.shareRatioList = model.shareRatioList;
                this.shareRuleId = model.shareRuleId;
                this.shareRuleName = model.shareRuleName;
                this.shareType = model.shareType;
                this.toCostCenterList = model.toCostCenterList;
            } 

            /**
             * FromCostCenterList.
             */
            public Builder fromCostCenterList(java.util.List<Long> fromCostCenterList) {
                this.fromCostCenterList = fromCostCenterList;
                return this;
            }

            /**
             * ShareRatioList.
             */
            public Builder shareRatioList(java.util.List<Double> shareRatioList) {
                this.shareRatioList = shareRatioList;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1828</p>
             */
            public Builder shareRuleId(Long shareRuleId) {
                this.shareRuleId = shareRuleId;
                return this;
            }

            /**
             * ShareRuleName.
             */
            public Builder shareRuleName(String shareRuleName) {
                this.shareRuleName = shareRuleName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>CUSTOM</p>
             */
            public Builder shareType(String shareType) {
                this.shareType = shareType;
                return this;
            }

            /**
             * ToCostCenterList.
             */
            public Builder toCostCenterList(java.util.List<Long> toCostCenterList) {
                this.toCostCenterList = toCostCenterList;
                return this;
            }

            public ModifyShareRuleList build() {
                return new ModifyShareRuleList(this);
            } 

        } 

    }
}
