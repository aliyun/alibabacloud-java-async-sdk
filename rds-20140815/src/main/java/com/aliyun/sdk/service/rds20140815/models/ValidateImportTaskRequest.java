// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link ValidateImportTaskRequest} extends {@link RequestModel}
 *
 * <p>ValidateImportTaskRequest</p>
 */
public class ValidateImportTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EstimatedSize")
    private Integer estimatedSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Host")
    @com.aliyun.core.annotation.Validation(required = true)
    private String host;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    @com.aliyun.core.annotation.Validation(required = true)
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Port")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 65536, minimum = 1)
    private Integer port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceInstanceId")
    private String sourceInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourcePlatform")
    private String sourcePlatform;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamPort")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 65535, minimum = 1)
    private Integer streamPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("User")
    @com.aliyun.core.annotation.Validation(required = true)
    private String user;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("XtrabackupPath")
    private String xtrabackupPath;

    private ValidateImportTaskRequest(Builder builder) {
        super(builder);
        this.dbInstanceId = builder.dbInstanceId;
        this.estimatedSize = builder.estimatedSize;
        this.host = builder.host;
        this.ownerId = builder.ownerId;
        this.password = builder.password;
        this.port = builder.port;
        this.regionId = builder.regionId;
        this.sourceInstanceId = builder.sourceInstanceId;
        this.sourcePlatform = builder.sourcePlatform;
        this.streamPort = builder.streamPort;
        this.user = builder.user;
        this.xtrabackupPath = builder.xtrabackupPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateImportTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbInstanceId
     */
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

    /**
     * @return estimatedSize
     */
    public Integer getEstimatedSize() {
        return this.estimatedSize;
    }

    /**
     * @return host
     */
    public String getHost() {
        return this.host;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return port
     */
    public Integer getPort() {
        return this.port;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sourceInstanceId
     */
    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

    /**
     * @return sourcePlatform
     */
    public String getSourcePlatform() {
        return this.sourcePlatform;
    }

    /**
     * @return streamPort
     */
    public Integer getStreamPort() {
        return this.streamPort;
    }

    /**
     * @return user
     */
    public String getUser() {
        return this.user;
    }

    /**
     * @return xtrabackupPath
     */
    public String getXtrabackupPath() {
        return this.xtrabackupPath;
    }

    public static final class Builder extends Request.Builder<ValidateImportTaskRequest, Builder> {
        private String dbInstanceId; 
        private Integer estimatedSize; 
        private String host; 
        private Long ownerId; 
        private String password; 
        private Integer port; 
        private String regionId; 
        private String sourceInstanceId; 
        private String sourcePlatform; 
        private Integer streamPort; 
        private String user; 
        private String xtrabackupPath; 

        private Builder() {
            super();
        } 

        private Builder(ValidateImportTaskRequest request) {
            super(request);
            this.dbInstanceId = request.dbInstanceId;
            this.estimatedSize = request.estimatedSize;
            this.host = request.host;
            this.ownerId = request.ownerId;
            this.password = request.password;
            this.port = request.port;
            this.regionId = request.regionId;
            this.sourceInstanceId = request.sourceInstanceId;
            this.sourcePlatform = request.sourcePlatform;
            this.streamPort = request.streamPort;
            this.user = request.user;
            this.xtrabackupPath = request.xtrabackupPath;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-sdfljk123****</p>
         */
        public Builder dbInstanceId(String dbInstanceId) {
            this.putQueryParameter("DbInstanceId", dbInstanceId);
            this.dbInstanceId = dbInstanceId;
            return this;
        }

        /**
         * EstimatedSize.
         */
        public Builder estimatedSize(Integer estimatedSize) {
            this.putQueryParameter("EstimatedSize", estimatedSize);
            this.estimatedSize = estimatedSize;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.10.1</p>
         */
        public Builder host(String host) {
            this.putQueryParameter("Host", host);
            this.host = host;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>UGFzc3dvcmQxMjMK</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        public Builder port(Integer port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SourceInstanceId.
         */
        public Builder sourceInstanceId(String sourceInstanceId) {
            this.putQueryParameter("SourceInstanceId", sourceInstanceId);
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }

        /**
         * SourcePlatform.
         */
        public Builder sourcePlatform(String sourcePlatform) {
            this.putQueryParameter("SourcePlatform", sourcePlatform);
            this.sourcePlatform = sourcePlatform;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9999</p>
         */
        public Builder streamPort(Integer streamPort) {
            this.putQueryParameter("StreamPort", streamPort);
            this.streamPort = streamPort;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>myadmin</p>
         */
        public Builder user(String user) {
            this.putQueryParameter("User", user);
            this.user = user;
            return this;
        }

        /**
         * XtrabackupPath.
         */
        public Builder xtrabackupPath(String xtrabackupPath) {
            this.putQueryParameter("XtrabackupPath", xtrabackupPath);
            this.xtrabackupPath = xtrabackupPath;
            return this;
        }

        @Override
        public ValidateImportTaskRequest build() {
            return new ValidateImportTaskRequest(this);
        } 

    } 

}
