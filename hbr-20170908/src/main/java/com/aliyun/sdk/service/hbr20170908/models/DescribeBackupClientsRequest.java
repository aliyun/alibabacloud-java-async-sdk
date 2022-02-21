// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupClientsRequest} extends {@link RequestModel}
 *
 * <p>DescribeBackupClientsRequest</p>
 */
public class DescribeBackupClientsRequest extends Request {
    @Body
    @NameInMap("ClientIds")
    private java.util.Map < String, ? > clientIds;

    @Query
    @NameInMap("ClientType")
    @Validation(required = true)
    private String clientType;

    @Body
    @NameInMap("InstanceIds")
    private java.util.Map < String, ? > instanceIds;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @Body
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    private DescribeBackupClientsRequest(Builder builder) {
        super(builder);
        this.clientIds = builder.clientIds;
        this.clientType = builder.clientType;
        this.instanceIds = builder.instanceIds;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupClientsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientIds
     */
    public java.util.Map < String, ? > getClientIds() {
        return this.clientIds;
    }

    /**
     * @return clientType
     */
    public String getClientType() {
        return this.clientType;
    }

    /**
     * @return instanceIds
     */
    public java.util.Map < String, ? > getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<DescribeBackupClientsRequest, Builder> {
        private java.util.Map < String, ? > clientIds; 
        private String clientType; 
        private java.util.Map < String, ? > instanceIds; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBackupClientsRequest response) {
            super(response);
            this.clientIds = response.clientIds;
            this.clientType = response.clientType;
            this.instanceIds = response.instanceIds;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.tag = response.tag;
        } 

        /**
         * ClientIds.
         */
        public Builder clientIds(java.util.Map < String, ? > clientIds) {
            this.putBodyParameter("ClientIds", clientIds);
            this.clientIds = clientIds;
            return this;
        }

        /**
         * ClientType.
         */
        public Builder clientType(String clientType) {
            this.putQueryParameter("ClientType", clientType);
            this.clientType = clientType;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(java.util.Map < String, ? > instanceIds) {
            this.putBodyParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putBodyParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public DescribeBackupClientsRequest build() {
            return new DescribeBackupClientsRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
