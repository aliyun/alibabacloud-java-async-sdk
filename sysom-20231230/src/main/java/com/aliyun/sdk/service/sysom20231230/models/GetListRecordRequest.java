// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link GetListRecordRequest} extends {@link RequestModel}
 *
 * <p>GetListRecordRequest</p>
 */
public class GetListRecordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("analysisId")
    private String analysisId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("current")
    private Long current;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("customId")
    private Long customId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    private GetListRecordRequest(Builder builder) {
        super(builder);
        this.analysisId = builder.analysisId;
        this.current = builder.current;
        this.customId = builder.customId;
        this.pageSize = builder.pageSize;
        this.region = builder.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetListRecordRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return analysisId
     */
    public String getAnalysisId() {
        return this.analysisId;
    }

    /**
     * @return current
     */
    public Long getCurrent() {
        return this.current;
    }

    /**
     * @return customId
     */
    public Long getCustomId() {
        return this.customId;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    public static final class Builder extends Request.Builder<GetListRecordRequest, Builder> {
        private String analysisId; 
        private Long current; 
        private Long customId; 
        private Long pageSize; 
        private String region; 

        private Builder() {
            super();
        } 

        private Builder(GetListRecordRequest request) {
            super(request);
            this.analysisId = request.analysisId;
            this.current = request.current;
            this.customId = request.customId;
            this.pageSize = request.pageSize;
            this.region = request.region;
        } 

        /**
         * analysisId.
         */
        public Builder analysisId(String analysisId) {
            this.putQueryParameter("analysisId", analysisId);
            this.analysisId = analysisId;
            return this;
        }

        /**
         * current.
         */
        public Builder current(Long current) {
            this.putQueryParameter("current", current);
            this.current = current;
            return this;
        }

        /**
         * customId.
         */
        public Builder customId(Long customId) {
            this.putQueryParameter("customId", customId);
            this.customId = customId;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * region.
         */
        public Builder region(String region) {
            this.putQueryParameter("region", region);
            this.region = region;
            return this;
        }

        @Override
        public GetListRecordRequest build() {
            return new GetListRecordRequest(this);
        } 

    } 

}
