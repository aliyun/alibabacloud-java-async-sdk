// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
    private java.util.List<Filters> filters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 10)
    private Long maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProtocolServiceIds")
    private String protocolServiceIds;

    private DescribeProtocolMountTargetRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.fileSystemId = builder.fileSystemId;
        this.filters = builder.filters;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.protocolServiceIds = builder.protocolServiceIds;
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
    public java.util.List<Filters> getFilters() {
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

    /**
     * @return protocolServiceIds
     */
    public String getProtocolServiceIds() {
        return this.protocolServiceIds;
    }

    public static final class Builder extends Request.Builder<DescribeProtocolMountTargetRequest, Builder> {
        private String clientToken; 
        private String fileSystemId; 
        private java.util.List<Filters> filters; 
        private Long maxResults; 
        private String nextToken; 
        private String protocolServiceIds; 

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
            this.protocolServiceIds = request.protocolServiceIds;
        } 

        /**
         * <p>Ensures the idempotence of the request. Generate a unique parameter value from your client to ensure that the value is unique among different requests.</p>
         * <p>ClientToken supports only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system uses the RequestId of the API request as the ClientToken. The RequestId may vary for each API request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-42665544****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The file system ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cpfs-099394bd928c****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>The filter keys for querying protocol service export directories.</p>
         */
        public Builder filters(java.util.List<Filters> filters) {
            this.putQueryParameter("Filters", filters);
            this.filters = filters;
            return this;
        }

        /**
         * <p>The maximum number of results to return per query.</p>
         * <ul>
         * <li><p>Valid values: 10 to 100.</p>
         * </li>
         * <li><p>Default value: 20.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token used to initiate the next request when the response is truncated. You can use this token to retrieve the remaining results from where the truncation occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>aBcdg==</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The list of protocol service IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>ptc-123xxx</p>
         */
        public Builder protocolServiceIds(String protocolServiceIds) {
            this.putQueryParameter("ProtocolServiceIds", protocolServiceIds);
            this.protocolServiceIds = protocolServiceIds;
            return this;
        }

        @Override
        public DescribeProtocolMountTargetRequest build() {
            return new DescribeProtocolMountTargetRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeProtocolMountTargetRequest} extends {@link TeaModel}
     *
     * <p>DescribeProtocolMountTargetRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(Filters model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The name of the filter key.</p>
             * <ul>
             * <li><p>ProtocolServiceIds: filters by protocol service ID.</p>
             * </li>
             * <li><p>ExportIds: filters by export directory ID.</p>
             * </li>
             * <li><p>VpcIds: filters by VPC ID.</p>
             * </li>
             * <li><p>FsetIds: filters by fileset ID.</p>
             * </li>
             * <li><p>Paths: filters by the file system path that corresponds to the mount target.</p>
             * </li>
             * <li><p>AccessGroupNames: filters by permission group name.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ExportIds</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the filter key. Wildcards are not supported.</p>
             * <ul>
             * <li><p>If Key is set to ProtocolServiceIds, set Value to a protocol service ID. You can specify up to 10 protocol service IDs. Example: <code>ptc-12345678</code> or <code>ptc-12345678,ptc-12345679</code>.</p>
             * </li>
             * <li><p>If Key is set to ExportIds, set Value to an export directory ID. You can specify up to 10 export directory IDs. Example: <code>exp-12345678</code> or <code>exp-12345678,exp-12345679</code>.</p>
             * </li>
             * <li><p>If Key is set to VpcIds, set Value to the VPC ID of the protocol service. You can specify up to 10 VPC IDs. Example: <code>vpc-12345678</code> or <code>vpc-12345678,vpc-12345679</code>.</p>
             * </li>
             * <li><p>If Key is set to FsetIds, set Value to a fileset ID. You can specify up to 10 fileset IDs. Example: <code>fset-12345678</code> or <code>fset-12345678,fset-12345679</code>.</p>
             * </li>
             * <li><p>If Key is set to Paths, set Value to the file system directory that corresponds to the mount target. You can specify up to 10 paths. Example: <code>/cpfs/mnt_1/</code> or <code>/cpfs/mnt_1/,/cpfs/mnt_2/</code>.</p>
             * </li>
             * <li><p>If Key is set to AccessGroupNames, set Value to the permission group name of the protocol service. You can specify up to 10 permission group names. Example: <code>ag-12345678</code> or <code>ag-12345678,ag-12345679</code>.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>exp-19abf5beab8d****, exp-19acf6beaf7d****</p>
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
