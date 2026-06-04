// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link SaveAppRequirementRequest} extends {@link RequestModel}
 *
 * <p>SaveAppRequirementRequest</p>
 */
public class SaveAppRequirementRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConversationId")
    private String conversationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Prd")
    private String prd;

    private SaveAppRequirementRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.conversationId = builder.conversationId;
        this.prd = builder.prd;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveAppRequirementRequest create() {
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
     * @return conversationId
     */
    public String getConversationId() {
        return this.conversationId;
    }

    /**
     * @return prd
     */
    public String getPrd() {
        return this.prd;
    }

    public static final class Builder extends Request.Builder<SaveAppRequirementRequest, Builder> {
        private String regionId; 
        private String conversationId; 
        private String prd; 

        private Builder() {
            super();
        } 

        private Builder(SaveAppRequirementRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.conversationId = request.conversationId;
            this.prd = request.prd;
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
         * ConversationId.
         */
        public Builder conversationId(String conversationId) {
            this.putQueryParameter("ConversationId", conversationId);
            this.conversationId = conversationId;
            return this;
        }

        /**
         * Prd.
         */
        public Builder prd(String prd) {
            this.putBodyParameter("Prd", prd);
            this.prd = prd;
            return this;
        }

        @Override
        public SaveAppRequirementRequest build() {
            return new SaveAppRequirementRequest(this);
        } 

    } 

}
