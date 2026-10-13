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
 * {@link DescribeProtocolServiceRequest} extends {@link RequestModel}
 *
 * <p>DescribeProtocolServiceRequest</p>
 */
public class DescribeProtocolServiceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(maxLength = 64, minLength = 1)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 128, minLength = 2)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
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
         * <p>Ensures the idempotency of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotency</a>.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId may vary for each API request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The description of the protocol service or a part of the description used for matching.</p>
         * <p>Limits:</p>
         * <ul>
         * <li>The description must be 2 to 128 characters in length.</li>
         * <li>The description must start with a letter and cannot start with <code>http://</code> or <code>https://</code>.</li>
         * <li>The description can contain digits, colons (:), underscores (_), or hyphens (-).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Description of this protocol service</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
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
         * <p>The maximum number of results to return for each request.</p>
         * <ul>
         * <li>Maximum value: 100.</li>
         * <li>Minimum value: 10.</li>
         * <li>Default value: 20.</li>
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
         * <p>The token used to initiate the next request if the response of the current request is truncated. You can use this token to retrieve the remaining results.</p>
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
         * <p>The protocol service IDs.</p>
         * <ul>
         * <li><p>Format: CSV</p>
         * </li>
         * <li><p>Limit: You can specify up to 10 protocol service IDs.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ptc-197ed6a00f2b****,ptc-196ed6a00f2b****</p>
         */
        public Builder protocolServiceIds(String protocolServiceIds) {
            this.putQueryParameter("ProtocolServiceIds", protocolServiceIds);
            this.protocolServiceIds = protocolServiceIds;
            return this;
        }

        /**
         * <p>The status of the protocol service used for matching.</p>
         * <p>Format: CSV</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Creating: The protocol service is being created.</li>
         * <li>Starting: The protocol service is being started.</li>
         * <li>Running: The protocol service is available.</li>
         * <li>Updating: The protocol service is being updated.</li>
         * <li>Deleting: The protocol service is being deleted.</li>
         * <li>Stopping: The protocol service is being stopped.</li>
         * <li>Stopped: The protocol service is stopped.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running,Updating</p>
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
