// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetCardStopRuleRequest} extends {@link RequestModel}
 *
 * <p>SetCardStopRuleRequest</p>
 */
public class SetCardStopRuleRequest extends Request {
    @Query
    @NameInMap("AutoRestore")
    @Validation(required = true)
    private Boolean autoRestore;

    @Query
    @NameInMap("FlowLimit")
    @Validation(required = true)
    private Long flowLimit;

    @Query
    @NameInMap("Iccid")
    @Validation(required = true)
    private String iccid;

    private SetCardStopRuleRequest(Builder builder) {
        super(builder);
        this.autoRestore = builder.autoRestore;
        this.flowLimit = builder.flowLimit;
        this.iccid = builder.iccid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetCardStopRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoRestore
     */
    public Boolean getAutoRestore() {
        return this.autoRestore;
    }

    /**
     * @return flowLimit
     */
    public Long getFlowLimit() {
        return this.flowLimit;
    }

    /**
     * @return iccid
     */
    public String getIccid() {
        return this.iccid;
    }

    public static final class Builder extends Request.Builder<SetCardStopRuleRequest, Builder> {
        private Boolean autoRestore; 
        private Long flowLimit; 
        private String iccid; 

        private Builder() {
            super();
        } 

        private Builder(SetCardStopRuleRequest request) {
            super(request);
            this.autoRestore = request.autoRestore;
            this.flowLimit = request.flowLimit;
            this.iccid = request.iccid;
        } 

        /**
         * AutoRestore.
         */
        public Builder autoRestore(Boolean autoRestore) {
            this.putQueryParameter("AutoRestore", autoRestore);
            this.autoRestore = autoRestore;
            return this;
        }

        /**
         * FlowLimit.
         */
        public Builder flowLimit(Long flowLimit) {
            this.putQueryParameter("FlowLimit", flowLimit);
            this.flowLimit = flowLimit;
            return this;
        }

        /**
         * Iccid.
         */
        public Builder iccid(String iccid) {
            this.putQueryParameter("Iccid", iccid);
            this.iccid = iccid;
            return this;
        }

        @Override
        public SetCardStopRuleRequest build() {
            return new SetCardStopRuleRequest(this);
        } 

    } 

}
