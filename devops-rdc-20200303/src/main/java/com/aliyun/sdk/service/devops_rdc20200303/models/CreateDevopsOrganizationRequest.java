// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDevopsOrganizationRequest} extends {@link RequestModel}
 *
 * <p>CreateDevopsOrganizationRequest</p>
 */
public class CreateDevopsOrganizationRequest extends Request {
    @Body
    @NameInMap("DesiredMemberCount")
    private Integer desiredMemberCount;

    @Body
    @NameInMap("OrgName")
    @Validation(required = true)
    private String orgName;

    @Body
    @NameInMap("RealPk")
    private String realPk;

    @Body
    @NameInMap("Source")
    @Validation(required = true)
    private String source;

    private CreateDevopsOrganizationRequest(Builder builder) {
        super(builder);
        this.desiredMemberCount = builder.desiredMemberCount;
        this.orgName = builder.orgName;
        this.realPk = builder.realPk;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDevopsOrganizationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desiredMemberCount
     */
    public Integer getDesiredMemberCount() {
        return this.desiredMemberCount;
    }

    /**
     * @return orgName
     */
    public String getOrgName() {
        return this.orgName;
    }

    /**
     * @return realPk
     */
    public String getRealPk() {
        return this.realPk;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<CreateDevopsOrganizationRequest, Builder> {
        private Integer desiredMemberCount; 
        private String orgName; 
        private String realPk; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(CreateDevopsOrganizationRequest response) {
            super(response);
            this.desiredMemberCount = response.desiredMemberCount;
            this.orgName = response.orgName;
            this.realPk = response.realPk;
            this.source = response.source;
        } 

        /**
         * DesiredMemberCount.
         */
        public Builder desiredMemberCount(Integer desiredMemberCount) {
            this.putBodyParameter("DesiredMemberCount", desiredMemberCount);
            this.desiredMemberCount = desiredMemberCount;
            return this;
        }

        /**
         * OrgName.
         */
        public Builder orgName(String orgName) {
            this.putBodyParameter("OrgName", orgName);
            this.orgName = orgName;
            return this;
        }

        /**
         * RealPk.
         */
        public Builder realPk(String realPk) {
            this.putBodyParameter("RealPk", realPk);
            this.realPk = realPk;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putBodyParameter("Source", source);
            this.source = source;
            return this;
        }

        @Override
        public CreateDevopsOrganizationRequest build() {
            return new CreateDevopsOrganizationRequest(this);
        } 

    } 

}
