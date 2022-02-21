// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBackupPlanResponseBody} extends {@link TeaModel}
 *
 * <p>CreateBackupPlanResponseBody</p>
 */
public class CreateBackupPlanResponseBody extends TeaModel {
    @NameInMap("ClusterId")
    private String clusterId;

    @NameInMap("Description")
    private String description;

    @NameInMap("Id")
    private String id;

    @NameInMap("Name")
    private String name;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RootPath")
    private String rootPath;

    private CreateBackupPlanResponseBody(Builder builder) {
        this.clusterId = builder.clusterId;
        this.description = builder.description;
        this.id = builder.id;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.rootPath = builder.rootPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBackupPlanResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
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

    /**
     * @return rootPath
     */
    public String getRootPath() {
        return this.rootPath;
    }

    public static final class Builder {
        private String clusterId; 
        private String description; 
        private String id; 
        private String name; 
        private String requestId; 
        private String rootPath; 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
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
         * RootPath.
         */
        public Builder rootPath(String rootPath) {
            this.rootPath = rootPath;
            return this;
        }

        public CreateBackupPlanResponseBody build() {
            return new CreateBackupPlanResponseBody(this);
        } 

    } 

}
