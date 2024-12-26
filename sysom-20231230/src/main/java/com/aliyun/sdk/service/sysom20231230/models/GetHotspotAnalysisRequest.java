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
 * {@link GetHotspotAnalysisRequest} extends {@link RequestModel}
 *
 * <p>GetHotspotAnalysisRequest</p>
 */
public class GetHotspotAnalysisRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("appType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("beg_end")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long begEnd;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("beg_start")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long begStart;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instance")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instance;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pid")
    private Long pid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("table")
    private String table;

    private GetHotspotAnalysisRequest(Builder builder) {
        super(builder);
        this.appType = builder.appType;
        this.begEnd = builder.begEnd;
        this.begStart = builder.begStart;
        this.instance = builder.instance;
        this.pid = builder.pid;
        this.table = builder.table;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHotspotAnalysisRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appType
     */
    public String getAppType() {
        return this.appType;
    }

    /**
     * @return begEnd
     */
    public Long getBegEnd() {
        return this.begEnd;
    }

    /**
     * @return begStart
     */
    public Long getBegStart() {
        return this.begStart;
    }

    /**
     * @return instance
     */
    public String getInstance() {
        return this.instance;
    }

    /**
     * @return pid
     */
    public Long getPid() {
        return this.pid;
    }

    /**
     * @return table
     */
    public String getTable() {
        return this.table;
    }

    public static final class Builder extends Request.Builder<GetHotspotAnalysisRequest, Builder> {
        private String appType; 
        private Long begEnd; 
        private Long begStart; 
        private String instance; 
        private Long pid; 
        private String table; 

        private Builder() {
            super();
        } 

        private Builder(GetHotspotAnalysisRequest request) {
            super(request);
            this.appType = request.appType;
            this.begEnd = request.begEnd;
            this.begStart = request.begStart;
            this.instance = request.instance;
            this.pid = request.pid;
            this.table = request.table;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>GR</p>
         */
        public Builder appType(String appType) {
            this.putBodyParameter("appType", appType);
            this.appType = appType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1725413948000</p>
         */
        public Builder begEnd(Long begEnd) {
            this.putBodyParameter("beg_end", begEnd);
            this.begEnd = begEnd;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1725410348000</p>
         */
        public Builder begStart(Long begStart) {
            this.putBodyParameter("beg_start", begStart);
            this.begStart = begStart;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-2ze5ru5rjurix7f71sxv</p>
         */
        public Builder instance(String instance) {
            this.putBodyParameter("instance", instance);
            this.instance = instance;
            return this;
        }

        /**
         * pid.
         */
        public Builder pid(Long pid) {
            this.putBodyParameter("pid", pid);
            this.pid = pid;
            return this;
        }

        /**
         * table.
         */
        public Builder table(String table) {
            this.putBodyParameter("table", table);
            this.table = table;
            return this;
        }

        @Override
        public GetHotspotAnalysisRequest build() {
            return new GetHotspotAnalysisRequest(this);
        } 

    } 

}
