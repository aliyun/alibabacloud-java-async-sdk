// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link PublishServiceVersionRequest} extends {@link RequestModel}
 *
 * <p>PublishServiceVersionRequest</p>
 */
public class PublishServiceVersionRequest extends Request {
    @Path
    @NameInMap("serviceName")
    private String serviceName;

    @Header
    @NameInMap("If-Match")
    private String ifMatch;

    @Body
    @NameInMap("description")
    private String description;


    private PublishServiceVersionRequest(Builder builder) {
        super(builder);
        this.serviceName = builder.serviceName;
        this.ifMatch = builder.ifMatch;
        this.description = builder.description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishServiceVersionRequest create() {
        return builder().build();
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return ifMatch
     */
    public String getIfMatch() {
        return this.ifMatch;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    public static final class Builder extends Request.Builder {
        private String serviceName; 
        private String ifMatch; 
        private String description; 

        /**
         * <p>服务名称</p>
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>If-Match.</p>
         */
        public Builder ifMatch(String ifMatch) {
            this.putHeaderParameter("If-Match", ifMatch);
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * <p>版本描述</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        public PublishServiceVersionRequest build() {
            return new PublishServiceVersionRequest(this);
        } 

    } 

}
