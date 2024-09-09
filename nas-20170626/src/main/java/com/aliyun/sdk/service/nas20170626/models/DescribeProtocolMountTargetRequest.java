// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeProtocolMountTargetRequest} extends {@link RequestModel}
 *
 * <p>DescribeProtocolMountTargetRequest</p>
 */
public class DescribeProtocolMountTargetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(maxLength = 64, minLength = 1)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filters")
    private java.util.List < Filters> filters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 10)
    private Long maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    private DescribeProtocolMountTargetRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.fileSystemId = builder.fileSystemId;
        this.filters = builder.filters;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProtocolMountTargetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return filters
     */
    public java.util.List < Filters> getFilters() {
        return this.filters;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder extends Request.Builder<DescribeProtocolMountTargetRequest, Builder> {
        private String clientToken; 
        private String fileSystemId; 
        private java.util.List < Filters> filters; 
        private Long maxResults; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeProtocolMountTargetRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.fileSystemId = request.fileSystemId;
            this.filters = request.filters;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.
         * <p>
         * 
         * The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How do I ensure the idempotence?](~~25693~~)
         * 
         * >  If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The ID of the file system.
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * The filter that is used to query the export directories of the protocol service.
         */
        public Builder filters(java.util.List < Filters> filters) {
            this.putQueryParameter("Filters", filters);
            this.filters = filters;
            return this;
        }

        /**
         * The number of results for each query.
         * <p>
         * 
         * *   Value values: 10 to 100.
         * *   Default value: 20.
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        @Override
        public DescribeProtocolMountTargetRequest build() {
            return new DescribeProtocolMountTargetRequest(this);
        } 

    } 

    public static class Filters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Filters(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filters create() {
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
             * The filter name.
             * <p>
             * 
             * *   ProtocolServiceIds: filters export directories by protocol service ID.
             * *   ExportIds: filters export directories by export directory ID.
             * *   VpcIds: filters export directories by virtual private cloud (VPC) ID.
             * *   VSwitchIds: filters export directories by vSwitch ID.
             * *   FsetIds: filters export directories by fileset ID.
             * *   Paths: filters export directories based on the path of the file system corresponding to the mount target.
             * *   AccessGroupNames: filters export directories by permission group name.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The filter value. This parameter does not support wildcards.
             * <p>
             * 
             * *   If Key is set to ProtocolServiceIds, set Value to a protocol service ID. You can specify a maximum of 10 protocol service IDs. Example: `ptc-12345678` or `ptc-12345678,ptc-12345679`.
             * *   If Key is set to ExportIds, set Value to an export directory ID. You can specify a maximum of 10 export directory IDs. Example: `exp-12345678` or `exp-12345678,exp-12345679`.
             * *   If Key is set to VpcIds, set Value to a VPC ID of the protocol service. You can specify a maximum of 10 VPC IDs. Example: `vpc-12345678` or `vpc-12345678,vpc-12345679`.
             * *   If Key is set to FsetIds, set Value to a fileset ID. You can specify a maximum of 10 fileset IDs. Example: `fset-12345678` or `fset-12345678,fset-12345679`.
             * *   If Key is set to Paths, set Value to a path of the file system corresponding to the mount target. You can specify a maximum of 10 paths. Example: `/cpfs/mnt_1/` or `/cpfs/mnt_1/,/cpfs/mnt_2/`.
             * *   If Key is set to AccessGroupNames, set Value to a permission group name for the protocol service. You can specify a maximum of 10 permission group names. Example: `ag-12345678` or `ag-12345678,ag-12345679`.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Filters build() {
                return new Filters(this);
            } 

        } 

    }
}
