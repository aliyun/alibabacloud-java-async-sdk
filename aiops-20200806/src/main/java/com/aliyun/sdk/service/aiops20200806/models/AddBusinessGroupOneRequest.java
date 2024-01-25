// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddBusinessGroupOneRequest} extends {@link RequestModel}
 *
 * <p>AddBusinessGroupOneRequest</p>
 */
public class AddBusinessGroupOneRequest extends Request {
    @Body
    @NameInMap("BusinessGroupDesc")
    private String businessGroupDesc;

    @Body
    @NameInMap("BusinessGroupName")
    private String businessGroupName;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    private AddBusinessGroupOneRequest(Builder builder) {
        super(builder);
        this.businessGroupDesc = builder.businessGroupDesc;
        this.businessGroupName = builder.businessGroupName;
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddBusinessGroupOneRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessGroupDesc
     */
    public String getBusinessGroupDesc() {
        return this.businessGroupDesc;
    }

    /**
     * @return businessGroupName
     */
    public String getBusinessGroupName() {
        return this.businessGroupName;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    public static final class Builder extends Request.Builder<AddBusinessGroupOneRequest, Builder> {
        private String businessGroupDesc; 
        private String businessGroupName; 
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(AddBusinessGroupOneRequest request) {
            super(request);
            this.businessGroupDesc = request.businessGroupDesc;
            this.businessGroupName = request.businessGroupName;
            this.operaUid = request.operaUid;
        } 

        /**
         * BusinessGroupDesc.
         */
        public Builder businessGroupDesc(String businessGroupDesc) {
            this.putBodyParameter("BusinessGroupDesc", businessGroupDesc);
            this.businessGroupDesc = businessGroupDesc;
            return this;
        }

        /**
         * BusinessGroupName.
         */
        public Builder businessGroupName(String businessGroupName) {
            this.putBodyParameter("BusinessGroupName", businessGroupName);
            this.businessGroupName = businessGroupName;
            return this;
        }

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putQueryParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        @Override
        public AddBusinessGroupOneRequest build() {
            return new AddBusinessGroupOneRequest(this);
        } 

    } 

}
