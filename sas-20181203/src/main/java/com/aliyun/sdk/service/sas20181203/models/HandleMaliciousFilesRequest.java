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
 * {@link HandleMaliciousFilesRequest} extends {@link RequestModel}
 *
 * <p>HandleMaliciousFilesRequest</p>
 */
public class HandleMaliciousFilesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileIdList")
    private java.util.List<Long> fileIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Operation")
    private String operation;

    private HandleMaliciousFilesRequest(Builder builder) {
        super(builder);
        this.fileIdList = builder.fileIdList;
        this.operation = builder.operation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HandleMaliciousFilesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileIdList
     */
    public java.util.List<Long> getFileIdList() {
        return this.fileIdList;
    }

    /**
     * @return operation
     */
    public String getOperation() {
        return this.operation;
    }

    public static final class Builder extends Request.Builder<HandleMaliciousFilesRequest, Builder> {
        private java.util.List<Long> fileIdList; 
        private String operation; 

        private Builder() {
            super();
        } 

        private Builder(HandleMaliciousFilesRequest request) {
            super(request);
            this.fileIdList = request.fileIdList;
            this.operation = request.operation;
        } 

        /**
         * <p>List of file IDs to be processed.</p>
         * <blockquote>
         * <h2>You can call <a href="~~ListAgentlessMaliciousFiles~~">ListAgentlessMaliciousFiles</a> to get the IDs.</h2>
         * </blockquote>
         */
        public Builder fileIdList(java.util.List<Long> fileIdList) {
            this.putQueryParameter("FileIdList", fileIdList);
            this.fileIdList = fileIdList;
            return this;
        }

        /**
         * <p>Type of operation:</p>
         * <ul>
         * <li>addWhitelist: Add to whitelist</li>
         * <li>offWhitelist: Remove from whitelist</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>addWhitelist</p>
         */
        public Builder operation(String operation) {
            this.putQueryParameter("Operation", operation);
            this.operation = operation;
            return this;
        }

        @Override
        public HandleMaliciousFilesRequest build() {
            return new HandleMaliciousFilesRequest(this);
        } 

    } 

}
