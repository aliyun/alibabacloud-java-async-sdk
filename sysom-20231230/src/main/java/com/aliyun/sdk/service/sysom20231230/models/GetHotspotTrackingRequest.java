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
 * {@link GetHotspotTrackingRequest} extends {@link RequestModel}
 *
 * <p>GetHotspotTrackingRequest</p>
 */
public class GetHotspotTrackingRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("beg_end")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long begEnd;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("beg_start")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long begStart;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("hot_type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hotType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instance")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instance;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pid")
    private Long pid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("table")
    @com.aliyun.core.annotation.Validation(required = true)
    private String table;

    private GetHotspotTrackingRequest(Builder builder) {
        super(builder);
        this.begEnd = builder.begEnd;
        this.begStart = builder.begStart;
        this.hotType = builder.hotType;
        this.instance = builder.instance;
        this.pid = builder.pid;
        this.table = builder.table;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHotspotTrackingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return hotType
     */
    public String getHotType() {
        return this.hotType;
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

    public static final class Builder extends Request.Builder<GetHotspotTrackingRequest, Builder> {
        private Long begEnd; 
        private Long begStart; 
        private String hotType; 
        private String instance; 
        private Long pid; 
        private String table; 

        private Builder() {
            super();
        } 

        private Builder(GetHotspotTrackingRequest request) {
            super(request);
            this.begEnd = request.begEnd;
            this.begStart = request.begStart;
            this.hotType = request.hotType;
            this.instance = request.instance;
            this.pid = request.pid;
            this.table = request.table;
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
         */
        public Builder hotType(String hotType) {
            this.putBodyParameter("hot_type", hotType);
            this.hotType = hotType;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>prof_on</p>
         */
        public Builder table(String table) {
            this.putBodyParameter("table", table);
            this.table = table;
            return this;
        }

        @Override
        public GetHotspotTrackingRequest build() {
            return new GetHotspotTrackingRequest(this);
        } 

    } 

}
