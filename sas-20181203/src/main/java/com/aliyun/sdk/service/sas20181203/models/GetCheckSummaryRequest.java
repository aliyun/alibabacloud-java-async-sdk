// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetCheckSummaryRequest} extends {@link RequestModel}
 *
 * <p>GetCheckSummaryRequest</p>
 */
public class GetCheckSummaryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsItemStatistic")
    private Boolean isItemStatistic;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private String resourceDirectoryAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Vendors")
    private java.util.List < String > vendors;

    private GetCheckSummaryRequest(Builder builder) {
        super(builder);
        this.isItemStatistic = builder.isItemStatistic;
        this.lang = builder.lang;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.vendors = builder.vendors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCheckSummaryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isItemStatistic
     */
    public Boolean getIsItemStatistic() {
        return this.isItemStatistic;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return resourceDirectoryAccountId
     */
    public String getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    /**
     * @return vendors
     */
    public java.util.List < String > getVendors() {
        return this.vendors;
    }

    public static final class Builder extends Request.Builder<GetCheckSummaryRequest, Builder> {
        private Boolean isItemStatistic; 
        private String lang; 
        private String resourceDirectoryAccountId; 
        private java.util.List < String > vendors; 

        private Builder() {
            super();
        } 

        private Builder(GetCheckSummaryRequest request) {
            super(request);
            this.isItemStatistic = request.isItemStatistic;
            this.lang = request.lang;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.vendors = request.vendors;
        } 

        /**
         * <p>Specifies whether to return the statistics of the check items, including the number of check items supported by the system and the number of check items available to you.</p>
         */
        public Builder isItemStatistic(Boolean isItemStatistic) {
            this.putQueryParameter("IsItemStatistic", isItemStatistic);
            this.isItemStatistic = isItemStatistic;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The account ID of the resource directory.</p>
         * 
         * <strong>example:</strong>
         * <p>000</p>
         */
        public Builder resourceDirectoryAccountId(String resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * <p>The cloud service providers.</p>
         */
        public Builder vendors(java.util.List < String > vendors) {
            this.putQueryParameter("Vendors", vendors);
            this.vendors = vendors;
            return this;
        }

        @Override
        public GetCheckSummaryRequest build() {
            return new GetCheckSummaryRequest(this);
        } 

    } 

}
