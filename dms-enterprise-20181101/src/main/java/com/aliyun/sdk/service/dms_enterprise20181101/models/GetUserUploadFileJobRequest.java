// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link GetUserUploadFileJobRequest} extends {@link RequestModel}
 *
 * <p>GetUserUploadFileJobRequest</p>
 */
public class GetUserUploadFileJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private GetUserUploadFileJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.jobKey = builder.jobKey;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserUploadFileJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return jobKey
     */
    public String getJobKey() {
        return this.jobKey;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<GetUserUploadFileJobRequest, Builder> {
        private String regionId; 
        private String jobKey; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(GetUserUploadFileJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.jobKey = request.jobKey;
            this.tid = request.tid;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The key of the file upload task. The key is returned when you call the <a href="https://help.aliyun.com/document_detail/206059.html">CreateUploadFileJob</a> or <a href="https://help.aliyun.com/document_detail/206060.html">CreateUploadOSSFileJob</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>65254a49100e</p>
         */
        public Builder jobKey(String jobKey) {
            this.putQueryParameter("JobKey", jobKey);
            this.jobKey = jobKey;
            return this;
        }

        /**
         * <p>The tenant ID.</p>
         * <blockquote>
         * <p>To view the tenant ID, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see <a href="https://help.aliyun.com/document_detail/181330.html">Manage DMS tenants</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public GetUserUploadFileJobRequest build() {
            return new GetUserUploadFileJobRequest(this);
        } 

    } 

}
