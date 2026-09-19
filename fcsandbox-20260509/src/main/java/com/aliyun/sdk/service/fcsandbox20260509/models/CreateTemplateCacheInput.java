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
 * {@link CreateTemplateCacheInput} extends {@link TeaModel}
 *
 * <p>CreateTemplateCacheInput</p>
 */
public class CreateTemplateCacheInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("teamID")
    private String teamID;

    @com.aliyun.core.annotation.NameInMap("templateID")
    private String templateID;

    private CreateTemplateCacheInput(Builder builder) {
        this.teamID = builder.teamID;
        this.templateID = builder.templateID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTemplateCacheInput create() {
        return builder().build();
    }

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

    public static final class Builder {
        private String teamID; 
        private String templateID; 

        private Builder() {
        } 

        private Builder(CreateTemplateCacheInput model) {
            this.teamID = model.teamID;
            this.templateID = model.templateID;
        } 

        /**
         * <p>The team ID.</p>
         * 
         * <strong>example:</strong>
         * <p>13b721e6-8cc8-5df2-af13-80316f7508af</p>
         */
        public Builder teamID(String teamID) {
            this.teamID = teamID;
            return this;
        }

        /**
         * <p>The unique identifier of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>us7dxqaezw5uu7aa2cm5</p>
         */
        public Builder templateID(String templateID) {
            this.templateID = templateID;
            return this;
        }

        public CreateTemplateCacheInput build() {
            return new CreateTemplateCacheInput(this);
        } 

    } 

}
