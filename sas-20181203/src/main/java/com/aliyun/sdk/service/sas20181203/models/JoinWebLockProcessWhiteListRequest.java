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
 * {@link JoinWebLockProcessWhiteListRequest} extends {@link RequestModel}
 *
 * <p>JoinWebLockProcessWhiteListRequest</p>
 */
public class JoinWebLockProcessWhiteListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcessPaths")
    private java.util.List<String> processPaths;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuids")
    private String uuids;

    private JoinWebLockProcessWhiteListRequest(Builder builder) {
        super(builder);
        this.processPaths = builder.processPaths;
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JoinWebLockProcessWhiteListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return processPaths
     */
    public java.util.List<String> getProcessPaths() {
        return this.processPaths;
    }

    /**
     * @return uuids
     */
    public String getUuids() {
        return this.uuids;
    }

    public static final class Builder extends Request.Builder<JoinWebLockProcessWhiteListRequest, Builder> {
        private java.util.List<String> processPaths; 
        private String uuids; 

        private Builder() {
            super();
        } 

        private Builder(JoinWebLockProcessWhiteListRequest request) {
            super(request);
            this.processPaths = request.processPaths;
            this.uuids = request.uuids;
        } 

        /**
         * <p>The paths of the processes.</p>
         */
        public Builder processPaths(java.util.List<String> processPaths) {
            this.putQueryParameter("ProcessPaths", processPaths);
            this.processPaths = processPaths;
            return this;
        }

        /**
         * <p>The UUIDs of the servers on which the processes run. Separate multiple UUIDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>0c1714dc-f7a3-4265-8364-7aa3fce8****,1cc45e7d-7698-4b2c-89d8-e8cba407****</p>
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        @Override
        public JoinWebLockProcessWhiteListRequest build() {
            return new JoinWebLockProcessWhiteListRequest(this);
        } 

    } 

}
