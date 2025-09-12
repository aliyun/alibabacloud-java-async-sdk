// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link TravelStandardRelateDeleteRequest} extends {@link RequestModel}
 *
 * <p>TravelStandardRelateDeleteRequest</p>
 */
public class TravelStandardRelateDeleteRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("from_group")
    private Boolean fromGroup;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("remove_list")
    private java.util.List<RemoveList> removeList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("rule_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long ruleId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private TravelStandardRelateDeleteRequest(Builder builder) {
        super(builder);
        this.fromGroup = builder.fromGroup;
        this.removeList = builder.removeList;
        this.ruleId = builder.ruleId;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TravelStandardRelateDeleteRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fromGroup
     */
    public Boolean getFromGroup() {
        return this.fromGroup;
    }

    /**
     * @return removeList
     */
    public java.util.List<RemoveList> getRemoveList() {
        return this.removeList;
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<TravelStandardRelateDeleteRequest, Builder> {
        private Boolean fromGroup; 
        private java.util.List<RemoveList> removeList; 
        private Long ruleId; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(TravelStandardRelateDeleteRequest request) {
            super(request);
            this.fromGroup = request.fromGroup;
            this.removeList = request.removeList;
            this.ruleId = request.ruleId;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * from_group.
         */
        public Builder fromGroup(Boolean fromGroup) {
            this.putBodyParameter("from_group", fromGroup);
            this.fromGroup = fromGroup;
            return this;
        }

        /**
         * remove_list.
         */
        public Builder removeList(java.util.List<RemoveList> removeList) {
            String removeListShrink = shrink(removeList, "remove_list", "json");
            this.putBodyParameter("remove_list", removeListShrink);
            this.removeList = removeList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6523763</p>
         */
        public Builder ruleId(Long ruleId) {
            this.putBodyParameter("rule_id", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public TravelStandardRelateDeleteRequest build() {
            return new TravelStandardRelateDeleteRequest(this);
        } 

    } 

    /**
     * 
     * {@link TravelStandardRelateDeleteRequest} extends {@link TeaModel}
     *
     * <p>TravelStandardRelateDeleteRequest</p>
     */
    public static class RemoveList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("entity_id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String entityId;

        @com.aliyun.core.annotation.NameInMap("entity_type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String entityType;

        private RemoveList(Builder builder) {
            this.entityId = builder.entityId;
            this.entityType = builder.entityType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RemoveList create() {
            return builder().build();
        }

        /**
         * @return entityId
         */
        public String getEntityId() {
            return this.entityId;
        }

        /**
         * @return entityType
         */
        public String getEntityType() {
            return this.entityType;
        }

        public static final class Builder {
            private String entityId; 
            private String entityType; 

            private Builder() {
            } 

            private Builder(RemoveList model) {
                this.entityId = model.entityId;
                this.entityType = model.entityType;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>667104628</p>
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder entityType(String entityType) {
                this.entityType = entityType;
                return this;
            }

            public RemoveList build() {
                return new RemoveList(this);
            } 

        } 

    }
}
