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
 * {@link GetHotspotCompareRequest} extends {@link RequestModel}
 *
 * <p>GetHotspotCompareRequest</p>
 */
public class GetHotspotCompareRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("beg1_end")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long beg1End;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("beg1_start")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long beg1Start;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("beg2_end")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long beg2End;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("beg2_start")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long beg2Start;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("hot_type")
    private String hotType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instance1")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instance1;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instance2")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instance2;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pid1")
    private Long pid1;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pid2")
    private Long pid2;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("table")
    @com.aliyun.core.annotation.Validation(required = true)
    private String table;

    private GetHotspotCompareRequest(Builder builder) {
        super(builder);
        this.beg1End = builder.beg1End;
        this.beg1Start = builder.beg1Start;
        this.beg2End = builder.beg2End;
        this.beg2Start = builder.beg2Start;
        this.hotType = builder.hotType;
        this.instance1 = builder.instance1;
        this.instance2 = builder.instance2;
        this.pid1 = builder.pid1;
        this.pid2 = builder.pid2;
        this.table = builder.table;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHotspotCompareRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beg1End
     */
    public Long getBeg1End() {
        return this.beg1End;
    }

    /**
     * @return beg1Start
     */
    public Long getBeg1Start() {
        return this.beg1Start;
    }

    /**
     * @return beg2End
     */
    public Long getBeg2End() {
        return this.beg2End;
    }

    /**
     * @return beg2Start
     */
    public Long getBeg2Start() {
        return this.beg2Start;
    }

    /**
     * @return hotType
     */
    public String getHotType() {
        return this.hotType;
    }

    /**
     * @return instance1
     */
    public String getInstance1() {
        return this.instance1;
    }

    /**
     * @return instance2
     */
    public String getInstance2() {
        return this.instance2;
    }

    /**
     * @return pid1
     */
    public Long getPid1() {
        return this.pid1;
    }

    /**
     * @return pid2
     */
    public Long getPid2() {
        return this.pid2;
    }

    /**
     * @return table
     */
    public String getTable() {
        return this.table;
    }

    public static final class Builder extends Request.Builder<GetHotspotCompareRequest, Builder> {
        private Long beg1End; 
        private Long beg1Start; 
        private Long beg2End; 
        private Long beg2Start; 
        private String hotType; 
        private String instance1; 
        private String instance2; 
        private Long pid1; 
        private Long pid2; 
        private String table; 

        private Builder() {
            super();
        } 

        private Builder(GetHotspotCompareRequest request) {
            super(request);
            this.beg1End = request.beg1End;
            this.beg1Start = request.beg1Start;
            this.beg2End = request.beg2End;
            this.beg2Start = request.beg2Start;
            this.hotType = request.hotType;
            this.instance1 = request.instance1;
            this.instance2 = request.instance2;
            this.pid1 = request.pid1;
            this.pid2 = request.pid2;
            this.table = request.table;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1725415774000</p>
         */
        public Builder beg1End(Long beg1End) {
            this.putBodyParameter("beg1_end", beg1End);
            this.beg1End = beg1End;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1725415474000</p>
         */
        public Builder beg1Start(Long beg1Start) {
            this.putBodyParameter("beg1_start", beg1Start);
            this.beg1Start = beg1Start;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1725415774000</p>
         */
        public Builder beg2End(Long beg2End) {
            this.putBodyParameter("beg2_end", beg2End);
            this.beg2End = beg2End;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1725415474000</p>
         */
        public Builder beg2Start(Long beg2Start) {
            this.putBodyParameter("beg2_start", beg2Start);
            this.beg2Start = beg2Start;
            return this;
        }

        /**
         * hot_type.
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
         * <p>i-2zei55fwj8nnu31h3z46&quot;</p>
         */
        public Builder instance1(String instance1) {
            this.putBodyParameter("instance1", instance1);
            this.instance1 = instance1;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder instance2(String instance2) {
            this.putBodyParameter("instance2", instance2);
            this.instance2 = instance2;
            return this;
        }

        /**
         * pid1.
         */
        public Builder pid1(Long pid1) {
            this.putBodyParameter("pid1", pid1);
            this.pid1 = pid1;
            return this;
        }

        /**
         * pid2.
         */
        public Builder pid2(Long pid2) {
            this.putBodyParameter("pid2", pid2);
            this.pid2 = pid2;
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
        public GetHotspotCompareRequest build() {
            return new GetHotspotCompareRequest(this);
        } 

    } 

}
