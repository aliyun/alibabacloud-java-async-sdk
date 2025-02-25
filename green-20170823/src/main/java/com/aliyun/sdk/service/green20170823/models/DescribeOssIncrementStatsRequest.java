// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOssIncrementStatsRequest} extends {@link RequestModel}
 *
 * <p>DescribeOssIncrementStatsRequest</p>
 */
public class DescribeOssIncrementStatsRequest extends Request {
    @Query
    @NameInMap("EndDate")
    @Validation(required = true)
    private String endDate;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("ResourceType")
    @Validation(required = true)
    private String resourceType;

    @Query
    @NameInMap("Scene")
    @Validation(required = true)
    private String scene;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("StartDate")
    @Validation(required = true)
    private String startDate;

    private DescribeOssIncrementStatsRequest(Builder builder) {
        super(builder);
        this.endDate = builder.endDate;
        this.lang = builder.lang;
        this.resourceType = builder.resourceType;
        this.scene = builder.scene;
        this.sourceIp = builder.sourceIp;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOssIncrementStatsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
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
     * @return scene
     */
    public String getScene() {
        return this.scene;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<DescribeOssIncrementStatsRequest, Builder> {
        private String endDate; 
        private String lang; 
        private String resourceType; 
        private String scene; 
        private String sourceIp; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(DescribeOssIncrementStatsRequest request) {
            super(request);
            this.endDate = request.endDate;
            this.lang = request.lang;
            this.resourceType = request.resourceType;
            this.scene = request.scene;
            this.sourceIp = request.sourceIp;
            this.startDate = request.startDate;
        } 

        /**
         * EndDate.
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
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
         * Scene.
         */
        public Builder scene(String scene) {
            this.putQueryParameter("Scene", scene);
            this.scene = scene;
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

        /**
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public DescribeOssIncrementStatsRequest build() {
            return new DescribeOssIncrementStatsRequest(this);
        } 

    } 

}
