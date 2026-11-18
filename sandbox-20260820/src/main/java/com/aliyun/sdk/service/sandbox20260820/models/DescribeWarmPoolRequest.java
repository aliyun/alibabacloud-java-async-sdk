// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sandbox20260820.models;

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
 * {@link DescribeWarmPoolRequest} extends {@link RequestModel}
 *
 * <p>DescribeWarmPoolRequest</p>
 */
public class DescribeWarmPoolRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("teamID")
    private String teamID;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("templateID")
    private String templateID;

    private DescribeWarmPoolRequest(Builder builder) {
        super(builder);
        this.teamID = builder.teamID;
        this.templateID = builder.templateID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWarmPoolRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return teamID
     */
    public String getTeamID() {
        return this.teamID;
    }

    /**
     * @return templateID
     */
    public String getTemplateID() {
        return this.templateID;
    }

    public static final class Builder extends Request.Builder<DescribeWarmPoolRequest, Builder> {
        private String teamID; 
        private String templateID; 

        private Builder() {
            super();
        } 

        private Builder(DescribeWarmPoolRequest request) {
            super(request);
            this.teamID = request.teamID;
            this.templateID = request.templateID;
        } 

        /**
         * <p>The team ID.</p>
         * 
         * <strong>example:</strong>
         * <p>team-example1234567890</p>
         */
        public Builder teamID(String teamID) {
            this.putPathParameter("teamID", teamID);
            this.teamID = teamID;
            return this;
        }

        /**
         * <p>The ID of the template associated with the warm pool.</p>
         * 
         * <strong>example:</strong>
         * <p>tpl-example1234567890</p>
         */
        public Builder templateID(String templateID) {
            this.putPathParameter("templateID", templateID);
            this.templateID = templateID;
            return this;
        }

        @Override
        public DescribeWarmPoolRequest build() {
            return new DescribeWarmPoolRequest(this);
        } 

    } 

}
