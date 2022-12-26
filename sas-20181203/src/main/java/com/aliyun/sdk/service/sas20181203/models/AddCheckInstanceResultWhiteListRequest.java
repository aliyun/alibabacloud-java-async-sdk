// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddCheckInstanceResultWhiteListRequest} extends {@link RequestModel}
 *
 * <p>AddCheckInstanceResultWhiteListRequest</p>
 */
public class AddCheckInstanceResultWhiteListRequest extends Request {
    @Query
    @NameInMap("CheckGroupId")
    private String checkGroupId;

    @Query
    @NameInMap("CheckId")
    private Long checkId;

    @Query
    @NameInMap("InstanceIds")
    private java.util.List < String > instanceIds;

    private AddCheckInstanceResultWhiteListRequest(Builder builder) {
        super(builder);
        this.checkGroupId = builder.checkGroupId;
        this.checkId = builder.checkId;
        this.instanceIds = builder.instanceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCheckInstanceResultWhiteListRequest create() {
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
     * @return checkId
     */
    public Long getCheckId() {
        return this.checkId;
    }

    /**
     * @return instanceIds
     */
    public java.util.List < String > getInstanceIds() {
        return this.instanceIds;
    }

    public static final class Builder extends Request.Builder<AddCheckInstanceResultWhiteListRequest, Builder> {
        private String checkGroupId; 
        private Long checkId; 
        private java.util.List < String > instanceIds; 

        private Builder() {
            super();
        } 

        private Builder(AddCheckInstanceResultWhiteListRequest request) {
            super(request);
            this.checkGroupId = request.checkGroupId;
            this.checkId = request.checkId;
            this.instanceIds = request.instanceIds;
        } 

        /**
         * CheckGroupId.
         */
        public Builder checkGroupId(String checkGroupId) {
            this.putQueryParameter("CheckGroupId", checkGroupId);
            this.checkGroupId = checkGroupId;
            return this;
        }

        /**
         * CheckId.
         */
        public Builder checkId(Long checkId) {
            this.putQueryParameter("CheckId", checkId);
            this.checkId = checkId;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        @Override
        public AddCheckInstanceResultWhiteListRequest build() {
            return new AddCheckInstanceResultWhiteListRequest(this);
        } 

    } 

}
