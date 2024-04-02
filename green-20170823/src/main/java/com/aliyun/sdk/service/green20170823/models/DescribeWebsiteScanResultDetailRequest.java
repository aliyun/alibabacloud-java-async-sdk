// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebsiteScanResultDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeWebsiteScanResultDetailRequest</p>
 */
public class DescribeWebsiteScanResultDetailRequest extends Request {
    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private Integer id;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("ResourceType")
    @Validation(required = true)
    private String resourceType;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private DescribeWebsiteScanResultDetailRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.lang = builder.lang;
        this.resourceType = builder.resourceType;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebsiteScanResultDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DescribeWebsiteScanResultDetailRequest, Builder> {
        private Integer id; 
        private String lang; 
        private String resourceType; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeWebsiteScanResultDetailRequest request) {
            super(request);
            this.id = request.id;
            this.lang = request.lang;
            this.resourceType = request.resourceType;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * Id.
         */
        public Builder id(Integer id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public DescribeWebsiteScanResultDetailRequest build() {
            return new DescribeWebsiteScanResultDetailRequest(this);
        } 

    } 

}
