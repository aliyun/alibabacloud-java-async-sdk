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
 * {@link GetHotSpotUniqListRequest} extends {@link RequestModel}
 *
 * <p>GetHotSpotUniqListRequest</p>
 */
public class GetHotSpotUniqListRequest extends Request {
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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("uniq")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uniq;

    private GetHotSpotUniqListRequest(Builder builder) {
        super(builder);
        this.begEnd = builder.begEnd;
        this.begStart = builder.begStart;
        this.instance = builder.instance;
        this.pid = builder.pid;
        this.table = builder.table;
        this.uniq = builder.uniq;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHotSpotUniqListRequest create() {
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

    /**
     * @return uniq
     */
    public String getUniq() {
        return this.uniq;
    }

    public static final class Builder extends Request.Builder<GetHotSpotUniqListRequest, Builder> {
        private Long begEnd; 
        private Long begStart; 
        private String instance; 
        private Long pid; 
        private String table; 
        private String uniq; 

        private Builder() {
            super();
        } 

        private Builder(GetHotSpotUniqListRequest request) {
            super(request);
            this.begEnd = request.begEnd;
            this.begStart = request.begStart;
            this.instance = request.instance;
            this.pid = request.pid;
            this.table = request.table;
            this.uniq = request.uniq;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1735010351000</p>
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
         * <p>1735008551000</p>
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
         * <p>i-bp1g2i0siirefgwnnnvy</p>
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

        /**
         * <p>This parameter is required.</p>
         */
        public Builder uniq(String uniq) {
            this.putBodyParameter("uniq", uniq);
            this.uniq = uniq;
            return this;
        }

        @Override
        public GetHotSpotUniqListRequest build() {
            return new GetHotSpotUniqListRequest(this);
        } 

    } 

}
