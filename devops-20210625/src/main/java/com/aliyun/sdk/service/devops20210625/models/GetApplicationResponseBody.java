// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>GetApplicationResponseBody</p>
 */
public class GetApplicationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("appTemplateDisplayName")
    private String appTemplateDisplayName;

    @com.aliyun.core.annotation.NameInMap("appTemplateName")
    private String appTemplateName;

    @com.aliyun.core.annotation.NameInMap("creatorAccountId")
    private String creatorAccountId;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetApplicationResponseBody(Builder builder) {
        this.appTemplateDisplayName = builder.appTemplateDisplayName;
        this.appTemplateName = builder.appTemplateName;
        this.creatorAccountId = builder.creatorAccountId;
        this.description = builder.description;
        this.gmtCreate = builder.gmtCreate;
        this.name = builder.name;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApplicationResponseBody create() {
        return builder().build();
    }

    /**
     * @return appTemplateDisplayName
     */
    public String getAppTemplateDisplayName() {
        return this.appTemplateDisplayName;
    }

    /**
     * @return appTemplateName
     */
    public String getAppTemplateName() {
        return this.appTemplateName;
    }

    /**
     * @return creatorAccountId
     */
    public String getCreatorAccountId() {
        return this.creatorAccountId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String appTemplateDisplayName; 
        private String appTemplateName; 
        private String creatorAccountId; 
        private String description; 
        private String gmtCreate; 
        private String name; 
        private String requestId; 

        /**
         * appTemplateDisplayName.
         */
        public Builder appTemplateDisplayName(String appTemplateDisplayName) {
            this.appTemplateDisplayName = appTemplateDisplayName;
            return this;
        }

        /**
         * appTemplateName.
         */
        public Builder appTemplateName(String appTemplateName) {
            this.appTemplateName = appTemplateName;
            return this;
        }

        /**
         * creatorAccountId.
         */
        public Builder creatorAccountId(String creatorAccountId) {
            this.creatorAccountId = creatorAccountId;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * gmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetApplicationResponseBody build() {
            return new GetApplicationResponseBody(this);
        } 

    } 

}
