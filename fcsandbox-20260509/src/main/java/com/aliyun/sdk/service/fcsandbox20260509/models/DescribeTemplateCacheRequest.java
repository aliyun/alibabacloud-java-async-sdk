// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fcsandbox20260509.models;

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
 * {@link DescribeTemplateCacheRequest} extends {@link RequestModel}
 *
 * <p>DescribeTemplateCacheRequest</p>
 */
public class DescribeTemplateCacheRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("templateID")
    private String templateID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("teamID")
    private String teamID;

    private DescribeTemplateCacheRequest(Builder builder) {
        super(builder);
        this.templateID = builder.templateID;
        this.teamID = builder.teamID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTemplateCacheRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return templateID
     */
    public String getTemplateID() {
        return this.templateID;
    }

    /**
     * @return teamID
     */
    public String getTeamID() {
        return this.teamID;
    }

    public static final class Builder extends Request.Builder<DescribeTemplateCacheRequest, Builder> {
        private String templateID; 
        private String teamID; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTemplateCacheRequest request) {
            super(request);
            this.templateID = request.templateID;
            this.teamID = request.teamID;
        } 

        /**
         * <p>The unique identifier of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>us7dxqaezw5uu7aa2cm5</p>
         */
        public Builder templateID(String templateID) {
            this.putPathParameter("templateID", templateID);
            this.templateID = templateID;
            return this;
        }

        /**
         * <p>The team ID.</p>
         * 
         * <strong>example:</strong>
         * <p>13b721e6-8cc8-5df2-af13-80316f7508af</p>
         */
        public Builder teamID(String teamID) {
            this.putQueryParameter("teamID", teamID);
            this.teamID = teamID;
            return this;
        }

        @Override
        public DescribeTemplateCacheRequest build() {
            return new DescribeTemplateCacheRequest(this);
        } 

    } 

}
