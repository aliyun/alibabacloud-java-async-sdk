// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCdsFileShareLinksRequest} extends {@link RequestModel}
 *
 * <p>DescribeCdsFileShareLinksRequest</p>
 */
public class DescribeCdsFileShareLinksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CdsId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cdsId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Creators")
    private java.util.List < String > creators;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShareId")
    private String shareId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShareName")
    private String shareName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeCdsFileShareLinksRequest(Builder builder) {
        super(builder);
        this.cdsId = builder.cdsId;
        this.creators = builder.creators;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.shareId = builder.shareId;
        this.shareName = builder.shareName;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdsFileShareLinksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cdsId
     */
    public String getCdsId() {
        return this.cdsId;
    }

    /**
     * @return creators
     */
    public java.util.List < String > getCreators() {
        return this.creators;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return shareId
     */
    public String getShareId() {
        return this.shareId;
    }

    /**
     * @return shareName
     */
    public String getShareName() {
        return this.shareName;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeCdsFileShareLinksRequest, Builder> {
        private String cdsId; 
        private java.util.List < String > creators; 
        private Integer maxResults; 
        private String nextToken; 
        private String shareId; 
        private String shareName; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCdsFileShareLinksRequest request) {
            super(request);
            this.cdsId = request.cdsId;
            this.creators = request.creators;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.shareId = request.shareId;
            this.shareName = request.shareName;
            this.status = request.status;
        } 

        /**
         * <p>The ID of the cloud disk.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+cds-532033****</p>
         */
        public Builder cdsId(String cdsId) {
            this.putQueryParameter("CdsId", cdsId);
            this.cdsId = cdsId;
            return this;
        }

        /**
         * <p>The users that create the file sharing links.</p>
         */
        public Builder creators(java.util.List < String > creators) {
            this.putQueryParameter("Creators", creators);
            this.creators = creators;
            return this;
        }

        /**
         * <p>The maximum number of resources to return. Valid values: 1 to 100. Default value: 100. The number of returned resources must be less than or equal to the specified number.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>Specifies the marker after which the returned list begins. If this parameter is not specified, all results are returned. Default value: null.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6nmB7qrRFJ8vmttjxPL****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the file sharing link.</p>
         * 
         * <strong>example:</strong>
         * <p>7JQX1Fs****</p>
         */
        public Builder shareId(String shareId) {
            this.putQueryParameter("ShareId", shareId);
            this.shareId = shareId;
            return this;
        }

        /**
         * <p>The sharing name for fuzzy search.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        public Builder shareName(String shareName) {
            this.putQueryParameter("ShareName", shareName);
            this.shareName = shareName;
            return this;
        }

        /**
         * <p>The file sharing status. Valid values: ● disabled: canceled ● enabled: valid</p>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeCdsFileShareLinksRequest build() {
            return new DescribeCdsFileShareLinksRequest(this);
        } 

    } 

}
