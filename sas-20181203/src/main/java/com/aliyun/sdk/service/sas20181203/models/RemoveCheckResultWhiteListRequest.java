// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveCheckResultWhiteListRequest} extends {@link RequestModel}
 *
 * <p>RemoveCheckResultWhiteListRequest</p>
 */
public class RemoveCheckResultWhiteListRequest extends Request {
    @Query
    @NameInMap("CheckGroupId")
    private String checkGroupId;

    @Query
    @NameInMap("CheckIds")
    private java.util.List < Long > checkIds;

    @Query
    @NameInMap("Type")
    private String type;

    private RemoveCheckResultWhiteListRequest(Builder builder) {
        super(builder);
        this.checkGroupId = builder.checkGroupId;
        this.checkIds = builder.checkIds;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveCheckResultWhiteListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkGroupId
     */
    public String getCheckGroupId() {
        return this.checkGroupId;
    }

    /**
     * @return checkIds
     */
    public java.util.List < Long > getCheckIds() {
        return this.checkIds;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<RemoveCheckResultWhiteListRequest, Builder> {
        private String checkGroupId; 
        private java.util.List < Long > checkIds; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(RemoveCheckResultWhiteListRequest request) {
            super(request);
            this.checkGroupId = request.checkGroupId;
            this.checkIds = request.checkIds;
            this.type = request.type;
        } 

        /**
         * This parameter is deprecated.
         */
        public Builder checkGroupId(String checkGroupId) {
            this.putQueryParameter("CheckGroupId", checkGroupId);
            this.checkGroupId = checkGroupId;
            return this;
        }

        /**
         * The IDs of check items.
         */
        public Builder checkIds(java.util.List < Long > checkIds) {
            this.putQueryParameter("CheckIds", checkIds);
            this.checkIds = checkIds;
            return this;
        }

        /**
         * This parameter is deprecated.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public RemoveCheckResultWhiteListRequest build() {
            return new RemoveCheckResultWhiteListRequest(this);
        } 

    } 

}
