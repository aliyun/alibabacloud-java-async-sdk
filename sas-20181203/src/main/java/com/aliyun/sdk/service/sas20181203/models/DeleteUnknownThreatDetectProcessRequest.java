// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DeleteUnknownThreatDetectProcessRequest} extends {@link RequestModel}
 *
 * <p>DeleteUnknownThreatDetectProcessRequest</p>
 */
public class DeleteUnknownThreatDetectProcessRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcessIdList")
    private java.util.List<String> processIdList;

    private DeleteUnknownThreatDetectProcessRequest(Builder builder) {
        super(builder);
        this.processIdList = builder.processIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUnknownThreatDetectProcessRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return processIdList
     */
    public java.util.List<String> getProcessIdList() {
        return this.processIdList;
    }

    public static final class Builder extends Request.Builder<DeleteUnknownThreatDetectProcessRequest, Builder> {
        private java.util.List<String> processIdList; 

        private Builder() {
            super();
        } 

        private Builder(DeleteUnknownThreatDetectProcessRequest request) {
            super(request);
            this.processIdList = request.processIdList;
        } 

        /**
         * ProcessIdList.
         */
        public Builder processIdList(java.util.List<String> processIdList) {
            this.putQueryParameter("ProcessIdList", processIdList);
            this.processIdList = processIdList;
            return this;
        }

        @Override
        public DeleteUnknownThreatDetectProcessRequest build() {
            return new DeleteUnknownThreatDetectProcessRequest(this);
        } 

    } 

}
