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
 * {@link TravelStandardRelateAddRequest} extends {@link RequestModel}
 *
 * <p>TravelStandardRelateAddRequest</p>
 */
public class TravelStandardRelateAddRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("add_list")
    private java.util.List<AddList> addList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("from_group")
    private Boolean fromGroup;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("rule_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long ruleId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    @com.aliyun.core.annotation.Validation(required = true)
    private String xAcsBtripCorpToken;

    private TravelStandardRelateAddRequest(Builder builder) {
        super(builder);
        this.addList = builder.addList;
        this.fromGroup = builder.fromGroup;
        this.ruleId = builder.ruleId;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TravelStandardRelateAddRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addList
     */
    public java.util.List<AddList> getAddList() {
        return this.addList;
    }

    /**
     * @return fromGroup
     */
    public Boolean getFromGroup() {
        return this.fromGroup;
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

    public static final class Builder extends Request.Builder<TravelStandardRelateAddRequest, Builder> {
        private java.util.List<AddList> addList; 
        private Boolean fromGroup; 
        private Long ruleId; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(TravelStandardRelateAddRequest request) {
            super(request);
            this.addList = request.addList;
            this.fromGroup = request.fromGroup;
            this.ruleId = request.ruleId;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * add_list.
         */
        public Builder addList(java.util.List<AddList> addList) {
            String addListShrink = shrink(addList, "add_list", "json");
            this.putBodyParameter("add_list", addListShrink);
            this.addList = addList;
            return this;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6516571</p>
         */
        public Builder ruleId(Long ruleId) {
            this.putBodyParameter("rule_id", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>feth00jqwls</p>
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public TravelStandardRelateAddRequest build() {
            return new TravelStandardRelateAddRequest(this);
        } 

    } 

    /**
     * 
     * {@link TravelStandardRelateAddRequest} extends {@link TeaModel}
     *
     * <p>TravelStandardRelateAddRequest</p>
     */
    public static class AddList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("entity_id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String entityId;

        @com.aliyun.core.annotation.NameInMap("entity_type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String entityType;

        private AddList(Builder builder) {
            this.entityId = builder.entityId;
            this.entityType = builder.entityType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddList create() {
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

            private Builder(AddList model) {
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

            public AddList build() {
                return new AddList(this);
            } 

        } 

    }
}
