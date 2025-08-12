// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

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
 * {@link DeleteHybridMonitorSLSGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteHybridMonitorSLSGroupRequest</p>
 */
public class DeleteHybridMonitorSLSGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SLSGroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String SLSGroupName;

    private DeleteHybridMonitorSLSGroupRequest(Builder builder) {
        super(builder);
        this.SLSGroupName = builder.SLSGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteHybridMonitorSLSGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return SLSGroupName
     */
    public String getSLSGroupName() {
        return this.SLSGroupName;
    }

    public static final class Builder extends Request.Builder<DeleteHybridMonitorSLSGroupRequest, Builder> {
        private String SLSGroupName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteHybridMonitorSLSGroupRequest request) {
            super(request);
            this.SLSGroupName = request.SLSGroupName;
        } 

        /**
         * <p>The name of the Logstore group.</p>
         * <p>For information about how to obtain the name of a Logstore group, see <a href="https://help.aliyun.com/document_detail/429526.html">DescribeHybridMonitorSLSGroup</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Logstore_test</p>
         */
        public Builder SLSGroupName(String SLSGroupName) {
            this.putQueryParameter("SLSGroupName", SLSGroupName);
            this.SLSGroupName = SLSGroupName;
            return this;
        }

        @Override
        public DeleteHybridMonitorSLSGroupRequest build() {
            return new DeleteHybridMonitorSLSGroupRequest(this);
        } 

    } 

}
