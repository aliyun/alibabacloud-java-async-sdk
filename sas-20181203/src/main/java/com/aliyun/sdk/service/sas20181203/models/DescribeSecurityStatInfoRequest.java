// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSecurityStatInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeSecurityStatInfoRequest</p>
 */
public class DescribeSecurityStatInfoRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("ResourceDirectoryAccountId")
    private String resourceDirectoryAccountId;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private DescribeSecurityStatInfoRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecurityStatInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DescribeSecurityStatInfoRequest, Builder> {
        private String lang; 
        private String resourceDirectoryAccountId; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSecurityStatInfoRequest request) {
            super(request);
            this.lang = request.lang;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * The numbers of low-risk unfixed vulnerabilities at all points in time.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The number of **high-risk** unfixed vulnerabilities at each point in time.
         */
        public Builder resourceDirectoryAccountId(String resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * The total number of baseline risk items on the current day.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public DescribeSecurityStatInfoRequest build() {
            return new DescribeSecurityStatInfoRequest(this);
        } 

    } 

}
