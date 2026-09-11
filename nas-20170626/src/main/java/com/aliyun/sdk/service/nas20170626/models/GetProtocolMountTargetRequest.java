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
 * {@link GetProtocolMountTargetRequest} extends {@link RequestModel}
 *
 * <p>GetProtocolMountTargetRequest</p>
 */
public class GetProtocolMountTargetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(maxLength = 64, minLength = 1)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExportId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String exportId;

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
    @com.aliyun.core.annotation.NameInMap("ProtocolServiceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String protocolServiceId;

    private GetProtocolMountTargetRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.exportId = builder.exportId;
        this.fileSystemId = builder.fileSystemId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.protocolServiceId = builder.protocolServiceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProtocolMountTargetRequest create() {
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
     * @return exportId
     */
    public String getExportId() {
        return this.exportId;
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
     * @return protocolServiceId
     */
    public String getProtocolServiceId() {
        return this.protocolServiceId;
    }

    public static final class Builder extends Request.Builder<GetProtocolMountTargetRequest, Builder> {
        private String clientToken; 
        private String exportId; 
        private String fileSystemId; 
        private Long maxResults; 
        private String nextToken; 
        private String protocolServiceId; 

        private Builder() {
            super();
        } 

        private Builder(GetProtocolMountTargetRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.exportId = request.exportId;
            this.fileSystemId = request.fileSystemId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.protocolServiceId = request.protocolServiceId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests.</p>
         * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId may vary for each API request.</p>
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
         * <p>The export directory ID of the protocol service. <strong>Required</strong>.</p>
         * <p><strong>How to obtain</strong>:</p>
         * <ul>
         * <li>Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createprotocolmounttarget-cpfs">CreateProtocolMountTarget</a> to create an export directory and obtain the ExportId from the response.</li>
         * <li>Or call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-describeprotocolmounttarget-cpfs">DescribeProtocolMountTarget</a> to query the list of export directories and obtain the ExportId from the response.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>exp-19abf5beab8d****</p>
         */
        public Builder exportId(String exportId) {
            this.putQueryParameter("ExportId", exportId);
            this.exportId = exportId;
            return this;
        }

        /**
         * <p>The file system ID.</p>
         * <ul>
         * <li><p>CPFS: The ID must start with <code>cpfs-</code>, such as cpfs-125487\<em>\</em>\<em>\</em>.</p>
         * </li>
         * <li><p>CPFS for Lingjun: The ID must start with <code>bmcpfs-</code>, such as bmcpfs-0015\<em>\</em>\<em>\</em>.</p>
         * </li>
         * <li><p>CPFS SE: The ID must start with <code>cpfsse-</code>, such as cpfsse-022c71b134\<em>\</em>\<em>\</em>.</p>
         * </li>
         * </ul>
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
         * <p>The maximum number of results to return per query.</p>
         * <p>Valid values: 10 to 100. Default value: 20.</p>
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
         * <p>If the response is truncated, you can use NextToken to send a subsequent request to retrieve the content after the current truncation point.</p>
         * 
         * <strong>example:</strong>
         * <p>M18xMA==</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The protocol service ID. <strong>Required</strong>.</p>
         * <p><strong>How to obtain</strong>: Call the <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-describeprotocolservice-cpfs">DescribeProtocolService</a> operation to query the list of protocol services and obtain the ProtocolServiceId from the response.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ptc-197ed6a00f2b****</p>
         */
        public Builder protocolServiceId(String protocolServiceId) {
            this.putQueryParameter("ProtocolServiceId", protocolServiceId);
            this.protocolServiceId = protocolServiceId;
            return this;
        }

        @Override
        public GetProtocolMountTargetRequest build() {
            return new GetProtocolMountTargetRequest(this);
        } 

    } 

}
