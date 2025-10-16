// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeAccessInstanceTaskRequest} extends {@link RequestModel}
 *
 * <p>DescribeAccessInstanceTaskRequest</p>
 */
public class DescribeAccessInstanceTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessInstanceId")
    private String accessInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessInstanceType")
    private String accessInstanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionNo")
    private String regionNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private DescribeAccessInstanceTaskRequest(Builder builder) {
        super(builder);
        this.accessInstanceId = builder.accessInstanceId;
        this.accessInstanceType = builder.accessInstanceType;
        this.lang = builder.lang;
        this.regionNo = builder.regionNo;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccessInstanceTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessInstanceId
     */
    public String getAccessInstanceId() {
        return this.accessInstanceId;
    }

    /**
     * @return accessInstanceType
     */
    public String getAccessInstanceType() {
        return this.accessInstanceType;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return regionNo
     */
    public String getRegionNo() {
        return this.regionNo;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<DescribeAccessInstanceTaskRequest, Builder> {
        private String accessInstanceId; 
        private String accessInstanceType; 
        private String lang; 
        private String regionNo; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAccessInstanceTaskRequest request) {
            super(request);
            this.accessInstanceId = request.accessInstanceId;
            this.accessInstanceType = request.accessInstanceType;
            this.lang = request.lang;
            this.regionNo = request.regionNo;
            this.taskId = request.taskId;
        } 

        /**
         * AccessInstanceId.
         */
        public Builder accessInstanceId(String accessInstanceId) {
            this.putQueryParameter("AccessInstanceId", accessInstanceId);
            this.accessInstanceId = accessInstanceId;
            return this;
        }

        /**
         * AccessInstanceType.
         */
        public Builder accessInstanceType(String accessInstanceType) {
            this.putQueryParameter("AccessInstanceType", accessInstanceType);
            this.accessInstanceType = accessInstanceType;
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
         * RegionNo.
         */
        public Builder regionNo(String regionNo) {
            this.putQueryParameter("RegionNo", regionNo);
            this.regionNo = regionNo;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public DescribeAccessInstanceTaskRequest build() {
            return new DescribeAccessInstanceTaskRequest(this);
        } 

    } 

}
