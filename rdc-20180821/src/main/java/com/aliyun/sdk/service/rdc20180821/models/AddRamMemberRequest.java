// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdc20180821.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddRamMemberRequest} extends {@link RequestModel}
 *
 * <p>AddRamMemberRequest</p>
 */
public class AddRamMemberRequest extends Request {
    @Body
    @NameInMap("CorpIdentifier")
    @Validation(required = true)
    private String corpIdentifier;

    @Body
    @NameInMap("StaffIdentifier")
    @Validation(required = true)
    private String staffIdentifier;

    private AddRamMemberRequest(Builder builder) {
        super(builder);
        this.corpIdentifier = builder.corpIdentifier;
        this.staffIdentifier = builder.staffIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddRamMemberRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return corpIdentifier
     */
    public String getCorpIdentifier() {
        return this.corpIdentifier;
    }

    /**
     * @return staffIdentifier
     */
    public String getStaffIdentifier() {
        return this.staffIdentifier;
    }

    public static final class Builder extends Request.Builder<AddRamMemberRequest, Builder> {
        private String corpIdentifier; 
        private String staffIdentifier; 

        private Builder() {
            super();
        } 

        private Builder(AddRamMemberRequest response) {
            super(response);
            this.corpIdentifier = response.corpIdentifier;
            this.staffIdentifier = response.staffIdentifier;
        } 

        /**
         * CorpIdentifier.
         */
        public Builder corpIdentifier(String corpIdentifier) {
            this.putBodyParameter("CorpIdentifier", corpIdentifier);
            this.corpIdentifier = corpIdentifier;
            return this;
        }

        /**
         * StaffIdentifier.
         */
        public Builder staffIdentifier(String staffIdentifier) {
            this.putBodyParameter("StaffIdentifier", staffIdentifier);
            this.staffIdentifier = staffIdentifier;
            return this;
        }

        @Override
        public AddRamMemberRequest build() {
            return new AddRamMemberRequest(this);
        } 

    } 

}
