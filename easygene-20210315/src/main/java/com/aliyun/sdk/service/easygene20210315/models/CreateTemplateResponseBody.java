// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTemplateResponseBody</p>
 */
public class CreateTemplateResponseBody extends TeaModel {
    @NameInMap("HostId")
    private String hostId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TemplateName")
    private String templateName;

    @NameInMap("Workspace")
    private String workspace;

    private CreateTemplateResponseBody(Builder builder) {
        this.hostId = builder.hostId;
        this.requestId = builder.requestId;
        this.templateName = builder.templateName;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return hostId
     */
    public String getHostId() {
        return this.hostId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private String hostId; 
        private String requestId; 
        private String templateName; 
        private String workspace; 

        /**
         * HostId.
         */
        public Builder hostId(String hostId) {
            this.hostId = hostId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.templateName = templateName;
            return this;
        }

        /**
         * Workspace.
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public CreateTemplateResponseBody build() {
            return new CreateTemplateResponseBody(this);
        } 

    } 

}
