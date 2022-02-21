// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataSourceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataSourceResponseBody</p>
 */
public class DescribeDataSourceResponseBody extends TeaModel {
    @NameInMap("CategoryId")
    private String categoryId;

    @NameInMap("ClusterId")
    private String clusterId;

    @NameInMap("Conf")
    private String conf;

    @NameInMap("CreateFrom")
    private String createFrom;

    @NameInMap("Creator")
    private String creator;

    @NameInMap("Description")
    private String description;

    @NameInMap("GmtCreate")
    private Long gmtCreate;

    @NameInMap("GmtModified")
    private Long gmtModified;

    @NameInMap("Id")
    private String id;

    @NameInMap("Modifier")
    private String modifier;

    @NameInMap("Name")
    private String name;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SourceType")
    private String sourceType;

    @NameInMap("Status")
    private String status;

    private DescribeDataSourceResponseBody(Builder builder) {
        this.categoryId = builder.categoryId;
        this.clusterId = builder.clusterId;
        this.conf = builder.conf;
        this.createFrom = builder.createFrom;
        this.creator = builder.creator;
        this.description = builder.description;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.id = builder.id;
        this.modifier = builder.modifier;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.sourceType = builder.sourceType;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataSourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return categoryId
     */
    public String getCategoryId() {
        return this.categoryId;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return conf
     */
    public String getConf() {
        return this.conf;
    }

    /**
     * @return createFrom
     */
    public String getCreateFrom() {
        return this.createFrom;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
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
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public Long getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return modifier
     */
    public String getModifier() {
        return this.modifier;
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
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String categoryId; 
        private String clusterId; 
        private String conf; 
        private String createFrom; 
        private String creator; 
        private String description; 
        private Long gmtCreate; 
        private Long gmtModified; 
        private String id; 
        private String modifier; 
        private String name; 
        private String requestId; 
        private String sourceType; 
        private String status; 

        /**
         * CategoryId.
         */
        public Builder categoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Conf.
         */
        public Builder conf(String conf) {
            this.conf = conf;
            return this;
        }

        /**
         * CreateFrom.
         */
        public Builder createFrom(String createFrom) {
            this.createFrom = createFrom;
            return this;
        }

        /**
         * Creator.
         */
        public Builder creator(String creator) {
            this.creator = creator;
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
         * GmtCreate.
         */
        public Builder gmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
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
         * Modifier.
         */
        public Builder modifier(String modifier) {
            this.modifier = modifier;
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
         * SourceType.
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeDataSourceResponseBody build() {
            return new DescribeDataSourceResponseBody(this);
        } 

    } 

}
