// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyCheckInstanceResultRequest} extends {@link RequestModel}
 *
 * <p>VerifyCheckInstanceResultRequest</p>
 */
public class VerifyCheckInstanceResultRequest extends Request {
    @Query
    @NameInMap("CheckId")
    private Long checkId;

    @Query
    @NameInMap("InstanceIds")
    private java.util.List < String > instanceIds;

    private VerifyCheckInstanceResultRequest(Builder builder) {
        super(builder);
        this.checkId = builder.checkId;
        this.instanceIds = builder.instanceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyCheckInstanceResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<VerifyCheckInstanceResultRequest, Builder> {
        private Long checkId; 
        private java.util.List < String > instanceIds; 

        private Builder() {
            super();
        } 

        private Builder(VerifyCheckInstanceResultRequest request) {
            super(request);
            this.checkId = request.checkId;
            this.instanceIds = request.instanceIds;
        } 

        /**
         * The ID of the check item.
         * <p>
         * 
         * > You can call the [ListCheckResult](~~ListCheckResult~~) operation to query the IDs of check items.
         */
        public Builder checkId(Long checkId) {
            this.putQueryParameter("CheckId", checkId);
            this.checkId = checkId;
            return this;
        }

        /**
         * The instance IDs of the assets on which risks are detected based on the check item.
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        @Override
        public VerifyCheckInstanceResultRequest build() {
            return new VerifyCheckInstanceResultRequest(this);
        } 

    } 

}
