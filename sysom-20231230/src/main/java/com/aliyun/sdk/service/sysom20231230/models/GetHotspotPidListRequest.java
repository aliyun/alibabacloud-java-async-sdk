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
 * {@link GetHotspotPidListRequest} extends {@link RequestModel}
 *
 * <p>GetHotspotPidListRequest</p>
 */
public class GetHotspotPidListRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("table")
    @com.aliyun.core.annotation.Validation(required = true)
    private String table;

    private GetHotspotPidListRequest(Builder builder) {
        super(builder);
        this.begEnd = builder.begEnd;
        this.begStart = builder.begStart;
        this.instance = builder.instance;
        this.table = builder.table;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHotspotPidListRequest create() {
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
     * @return table
     */
    public String getTable() {
        return this.table;
    }

    public static final class Builder extends Request.Builder<GetHotspotPidListRequest, Builder> {
        private Long begEnd; 
        private Long begStart; 
        private String instance; 
        private String table; 

        private Builder() {
            super();
        } 

        private Builder(GetHotspotPidListRequest request) {
            super(request);
            this.begEnd = request.begEnd;
            this.begStart = request.begStart;
            this.instance = request.instance;
            this.table = request.table;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1725413947000</p>
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
         * <p>1725413647000</p>
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
        public GetHotspotPidListRequest build() {
            return new GetHotspotPidListRequest(this);
        } 

    } 

}
