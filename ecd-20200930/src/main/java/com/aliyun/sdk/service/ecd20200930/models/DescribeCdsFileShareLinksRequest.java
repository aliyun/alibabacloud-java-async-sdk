// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdsFileShareLinksRequest} extends {@link RequestModel}
 *
 * <p>DescribeCdsFileShareLinksRequest</p>
 */
public class DescribeCdsFileShareLinksRequest extends Request {
    @Query
    @NameInMap("CdsId")
    @Validation(required = true)
    private String cdsId;

    @Query
    @NameInMap("Creators")
    private java.util.List < String > creators;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 100)
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("ShareId")
    private String shareId;

    @Query
    @NameInMap("ShareName")
    private String shareName;

    @Query
    @NameInMap("Status")
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
         * The ID of the cloud disk.
         */
        public Builder cdsId(String cdsId) {
            this.putQueryParameter("CdsId", cdsId);
            this.cdsId = cdsId;
            return this;
        }

        /**
         * The users that create the file sharing links.
         */
        public Builder creators(java.util.List < String > creators) {
            this.putQueryParameter("Creators", creators);
            this.creators = creators;
            return this;
        }

        /**
         * The maximum number of resources to return. Valid values: 1 to 100. Default value: 100. The number of returned resources must be less than or equal to the specified number.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * Specifies the marker after which the returned list begins. If this parameter is not specified, all results are returned. Default value: null.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the file sharing link.
         */
        public Builder shareId(String shareId) {
            this.putQueryParameter("ShareId", shareId);
            this.shareId = shareId;
            return this;
        }

        /**
         * The sharing name for fuzzy search.
         */
        public Builder shareName(String shareName) {
            this.putQueryParameter("ShareName", shareName);
            this.shareName = shareName;
            return this;
        }

        /**
         * The file sharing status. Valid values: ● disabled: canceled ● enabled: valid
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
