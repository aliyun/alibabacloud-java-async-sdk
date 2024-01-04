// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateApplicationResponseBody</p>
 */
public class UpdateApplicationResponseBody extends TeaModel {
    @NameInMap("creatorAccountId")
    private String creatorAccountId;

    @NameInMap("description")
    private String description;

    @NameInMap("gmtCreate")
    private String gmtCreate;

    @NameInMap("name")
    private String name;

    @NameInMap("requestId")
    private String requestId;

    private UpdateApplicationResponseBody(Builder builder) {
        this.creatorAccountId = builder.creatorAccountId;
        this.description = builder.description;
        this.gmtCreate = builder.gmtCreate;
        this.name = builder.name;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApplicationResponseBody create() {
        return builder().build();
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
        private String creatorAccountId; 
        private String description; 
        private String gmtCreate; 
        private String name; 
        private String requestId; 

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

        public UpdateApplicationResponseBody build() {
            return new UpdateApplicationResponseBody(this);
        } 

    } 

}
