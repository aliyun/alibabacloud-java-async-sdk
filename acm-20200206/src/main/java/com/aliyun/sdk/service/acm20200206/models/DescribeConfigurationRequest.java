// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.acm20200206.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeConfigurationRequest} extends {@link RequestModel}
 *
 * <p>DescribeConfigurationRequest</p>
 */
public class DescribeConfigurationRequest extends Request {
    @Query
    @NameInMap("DataId")
    @Validation(required = true)
    private String dataId;

    @Query
    @NameInMap("Group")
    @Validation(required = true)
    private String group;

    @Query
    @NameInMap("NamespaceId")
    @Validation(required = true)
    private String namespaceId;

    private DescribeConfigurationRequest(Builder builder) {
        super(builder);
        this.dataId = builder.dataId;
        this.group = builder.group;
        this.namespaceId = builder.namespaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConfigurationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataId
     */
    public String getDataId() {
        return this.dataId;
    }

    /**
     * @return group
     */
    public String getGroup() {
        return this.group;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public static final class Builder extends Request.Builder<DescribeConfigurationRequest, Builder> {
        private String dataId; 
        private String group; 
        private String namespaceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeConfigurationRequest response) {
            super(response);
            this.dataId = response.dataId;
            this.group = response.group;
            this.namespaceId = response.namespaceId;
        } 

        /**
         * DataId.
         */
        public Builder dataId(String dataId) {
            this.putQueryParameter("DataId", dataId);
            this.dataId = dataId;
            return this;
        }

        /**
         * Group.
         */
        public Builder group(String group) {
            this.putQueryParameter("Group", group);
            this.group = group;
            return this;
        }

        /**
         * NamespaceId.
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        @Override
        public DescribeConfigurationRequest build() {
            return new DescribeConfigurationRequest(this);
        } 

    } 

}
