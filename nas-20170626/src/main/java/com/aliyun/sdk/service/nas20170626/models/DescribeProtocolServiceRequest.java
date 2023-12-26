// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeProtocolServiceRequest} extends {@link RequestModel}
 *
 * <p>DescribeProtocolServiceRequest</p>
 */
public class DescribeProtocolServiceRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    @Validation(maxLength = 64, minLength = 1)
    private String clientToken;

    @Query
    @NameInMap("Description")
    @Validation(maxLength = 128, minLength = 2)
    private String description;

    @Query
    @NameInMap("FileSystemId")
    @Validation(required = true)
    private String fileSystemId;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 100, minimum = 10)
    private Long maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("ProtocolServiceIds")
    private String protocolServiceIds;

    @Query
    @NameInMap("Status")
    private String status;

    private DescribeProtocolServiceRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.fileSystemId = builder.fileSystemId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.protocolServiceIds = builder.protocolServiceIds;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProtocolServiceRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
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

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeProtocolServiceRequest, Builder> {
        private String clientToken; 
        private String description; 
        private String fileSystemId; 
        private Long maxResults; 
        private String nextToken; 
        private String protocolServiceIds; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeProtocolServiceRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.fileSystemId = request.fileSystemId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.protocolServiceIds = request.protocolServiceIds;
            this.status = request.status;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How do I ensure the idempotence?](~~25693~~)
         * <p>
         * 
         * >  If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The description or a part of the description of the protocol service.
         * <p>
         * 
         * Limits:
         * 
         * *   The description must be 2 to 128 characters in length.
         * *   The description must start with a letter and cannot start with `http://` or `https://`.
         * *   The description can contain letters, digits, colons (:), underscores (\_), and hyphens (-).
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
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
         * The number of results for each query.
         * <p>
         * 
         * *   Maximum value: 100.
         * *   Minimum value: 10.
         * *   Default value: 20.
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results. If not all dataflows are returned in a query, the return value of the NextToken parameter is not empty. You must specify the token that is obtained from the previous query as the value of NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the protocol service.
         * <p>
         * 
         * *   Format: CSV.
         * *   Limit: You can specify a maximum of 10 protocol service IDs.
         */
        public Builder protocolServiceIds(String protocolServiceIds) {
            this.putQueryParameter("ProtocolServiceIds", protocolServiceIds);
            this.protocolServiceIds = protocolServiceIds;
            return this;
        }

        /**
         * The status of the protocol service.
         * <p>
         * 
         * Format: CSV.
         * 
         * Valid values:
         * 
         * *   Creating: The protocol service is being created.
         * *   Starting: The protocol service is being started.
         * *   Running: The protocol service is running.
         * *   Updating: The protocol service is being updated.
         * *   Deleting: The protocol service is being deleted.
         * *   Stopping: The protocol service is being stopped.
         * *   Stopped: The protocol service is stopped.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeProtocolServiceRequest build() {
            return new DescribeProtocolServiceRequest(this);
        } 

    } 

}
