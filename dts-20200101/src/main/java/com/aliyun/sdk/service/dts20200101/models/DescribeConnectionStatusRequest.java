// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeConnectionStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeConnectionStatusRequest</p>
 */
public class DescribeConnectionStatusRequest extends Request {
    @Query
    @NameInMap("DestinationEndpointArchitecture")
    private String destinationEndpointArchitecture;

    @Query
    @NameInMap("DestinationEndpointDatabaseName")
    private String destinationEndpointDatabaseName;

    @Query
    @NameInMap("DestinationEndpointEngineName")
    private String destinationEndpointEngineName;

    @Query
    @NameInMap("DestinationEndpointIP")
    private String destinationEndpointIP;

    @Query
    @NameInMap("DestinationEndpointInstanceID")
    private String destinationEndpointInstanceID;

    @Query
    @NameInMap("DestinationEndpointInstanceType")
    @Validation(required = true)
    private String destinationEndpointInstanceType;

    @Query
    @NameInMap("DestinationEndpointOracleSID")
    private String destinationEndpointOracleSID;

    @Query
    @NameInMap("DestinationEndpointPassword")
    private String destinationEndpointPassword;

    @Query
    @NameInMap("DestinationEndpointPort")
    private String destinationEndpointPort;

    @Query
    @NameInMap("DestinationEndpointRegion")
    private String destinationEndpointRegion;

    @Query
    @NameInMap("DestinationEndpointUserName")
    private String destinationEndpointUserName;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SourceEndpointArchitecture")
    private String sourceEndpointArchitecture;

    @Query
    @NameInMap("SourceEndpointDatabaseName")
    private String sourceEndpointDatabaseName;

    @Query
    @NameInMap("SourceEndpointEngineName")
    private String sourceEndpointEngineName;

    @Query
    @NameInMap("SourceEndpointIP")
    private String sourceEndpointIP;

    @Query
    @NameInMap("SourceEndpointInstanceID")
    private String sourceEndpointInstanceID;

    @Query
    @NameInMap("SourceEndpointInstanceType")
    @Validation(required = true)
    private String sourceEndpointInstanceType;

    @Query
    @NameInMap("SourceEndpointOracleSID")
    private String sourceEndpointOracleSID;

    @Query
    @NameInMap("SourceEndpointPassword")
    private String sourceEndpointPassword;

    @Query
    @NameInMap("SourceEndpointPort")
    private String sourceEndpointPort;

    @Query
    @NameInMap("SourceEndpointRegion")
    private String sourceEndpointRegion;

    @Query
    @NameInMap("SourceEndpointUserName")
    private String sourceEndpointUserName;

    private DescribeConnectionStatusRequest(Builder builder) {
        super(builder);
        this.destinationEndpointArchitecture = builder.destinationEndpointArchitecture;
        this.destinationEndpointDatabaseName = builder.destinationEndpointDatabaseName;
        this.destinationEndpointEngineName = builder.destinationEndpointEngineName;
        this.destinationEndpointIP = builder.destinationEndpointIP;
        this.destinationEndpointInstanceID = builder.destinationEndpointInstanceID;
        this.destinationEndpointInstanceType = builder.destinationEndpointInstanceType;
        this.destinationEndpointOracleSID = builder.destinationEndpointOracleSID;
        this.destinationEndpointPassword = builder.destinationEndpointPassword;
        this.destinationEndpointPort = builder.destinationEndpointPort;
        this.destinationEndpointRegion = builder.destinationEndpointRegion;
        this.destinationEndpointUserName = builder.destinationEndpointUserName;
        this.regionId = builder.regionId;
        this.sourceEndpointArchitecture = builder.sourceEndpointArchitecture;
        this.sourceEndpointDatabaseName = builder.sourceEndpointDatabaseName;
        this.sourceEndpointEngineName = builder.sourceEndpointEngineName;
        this.sourceEndpointIP = builder.sourceEndpointIP;
        this.sourceEndpointInstanceID = builder.sourceEndpointInstanceID;
        this.sourceEndpointInstanceType = builder.sourceEndpointInstanceType;
        this.sourceEndpointOracleSID = builder.sourceEndpointOracleSID;
        this.sourceEndpointPassword = builder.sourceEndpointPassword;
        this.sourceEndpointPort = builder.sourceEndpointPort;
        this.sourceEndpointRegion = builder.sourceEndpointRegion;
        this.sourceEndpointUserName = builder.sourceEndpointUserName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConnectionStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return destinationEndpointArchitecture
     */
    public String getDestinationEndpointArchitecture() {
        return this.destinationEndpointArchitecture;
    }

    /**
     * @return destinationEndpointDatabaseName
     */
    public String getDestinationEndpointDatabaseName() {
        return this.destinationEndpointDatabaseName;
    }

    /**
     * @return destinationEndpointEngineName
     */
    public String getDestinationEndpointEngineName() {
        return this.destinationEndpointEngineName;
    }

    /**
     * @return destinationEndpointIP
     */
    public String getDestinationEndpointIP() {
        return this.destinationEndpointIP;
    }

    /**
     * @return destinationEndpointInstanceID
     */
    public String getDestinationEndpointInstanceID() {
        return this.destinationEndpointInstanceID;
    }

    /**
     * @return destinationEndpointInstanceType
     */
    public String getDestinationEndpointInstanceType() {
        return this.destinationEndpointInstanceType;
    }

    /**
     * @return destinationEndpointOracleSID
     */
    public String getDestinationEndpointOracleSID() {
        return this.destinationEndpointOracleSID;
    }

    /**
     * @return destinationEndpointPassword
     */
    public String getDestinationEndpointPassword() {
        return this.destinationEndpointPassword;
    }

    /**
     * @return destinationEndpointPort
     */
    public String getDestinationEndpointPort() {
        return this.destinationEndpointPort;
    }

    /**
     * @return destinationEndpointRegion
     */
    public String getDestinationEndpointRegion() {
        return this.destinationEndpointRegion;
    }

    /**
     * @return destinationEndpointUserName
     */
    public String getDestinationEndpointUserName() {
        return this.destinationEndpointUserName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sourceEndpointArchitecture
     */
    public String getSourceEndpointArchitecture() {
        return this.sourceEndpointArchitecture;
    }

    /**
     * @return sourceEndpointDatabaseName
     */
    public String getSourceEndpointDatabaseName() {
        return this.sourceEndpointDatabaseName;
    }

    /**
     * @return sourceEndpointEngineName
     */
    public String getSourceEndpointEngineName() {
        return this.sourceEndpointEngineName;
    }

    /**
     * @return sourceEndpointIP
     */
    public String getSourceEndpointIP() {
        return this.sourceEndpointIP;
    }

    /**
     * @return sourceEndpointInstanceID
     */
    public String getSourceEndpointInstanceID() {
        return this.sourceEndpointInstanceID;
    }

    /**
     * @return sourceEndpointInstanceType
     */
    public String getSourceEndpointInstanceType() {
        return this.sourceEndpointInstanceType;
    }

    /**
     * @return sourceEndpointOracleSID
     */
    public String getSourceEndpointOracleSID() {
        return this.sourceEndpointOracleSID;
    }

    /**
     * @return sourceEndpointPassword
     */
    public String getSourceEndpointPassword() {
        return this.sourceEndpointPassword;
    }

    /**
     * @return sourceEndpointPort
     */
    public String getSourceEndpointPort() {
        return this.sourceEndpointPort;
    }

    /**
     * @return sourceEndpointRegion
     */
    public String getSourceEndpointRegion() {
        return this.sourceEndpointRegion;
    }

    /**
     * @return sourceEndpointUserName
     */
    public String getSourceEndpointUserName() {
        return this.sourceEndpointUserName;
    }

    public static final class Builder extends Request.Builder<DescribeConnectionStatusRequest, Builder> {
        private String destinationEndpointArchitecture; 
        private String destinationEndpointDatabaseName; 
        private String destinationEndpointEngineName; 
        private String destinationEndpointIP; 
        private String destinationEndpointInstanceID; 
        private String destinationEndpointInstanceType; 
        private String destinationEndpointOracleSID; 
        private String destinationEndpointPassword; 
        private String destinationEndpointPort; 
        private String destinationEndpointRegion; 
        private String destinationEndpointUserName; 
        private String regionId; 
        private String sourceEndpointArchitecture; 
        private String sourceEndpointDatabaseName; 
        private String sourceEndpointEngineName; 
        private String sourceEndpointIP; 
        private String sourceEndpointInstanceID; 
        private String sourceEndpointInstanceType; 
        private String sourceEndpointOracleSID; 
        private String sourceEndpointPassword; 
        private String sourceEndpointPort; 
        private String sourceEndpointRegion; 
        private String sourceEndpointUserName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeConnectionStatusRequest response) {
            super(response);
            this.destinationEndpointArchitecture = response.destinationEndpointArchitecture;
            this.destinationEndpointDatabaseName = response.destinationEndpointDatabaseName;
            this.destinationEndpointEngineName = response.destinationEndpointEngineName;
            this.destinationEndpointIP = response.destinationEndpointIP;
            this.destinationEndpointInstanceID = response.destinationEndpointInstanceID;
            this.destinationEndpointInstanceType = response.destinationEndpointInstanceType;
            this.destinationEndpointOracleSID = response.destinationEndpointOracleSID;
            this.destinationEndpointPassword = response.destinationEndpointPassword;
            this.destinationEndpointPort = response.destinationEndpointPort;
            this.destinationEndpointRegion = response.destinationEndpointRegion;
            this.destinationEndpointUserName = response.destinationEndpointUserName;
            this.regionId = response.regionId;
            this.sourceEndpointArchitecture = response.sourceEndpointArchitecture;
            this.sourceEndpointDatabaseName = response.sourceEndpointDatabaseName;
            this.sourceEndpointEngineName = response.sourceEndpointEngineName;
            this.sourceEndpointIP = response.sourceEndpointIP;
            this.sourceEndpointInstanceID = response.sourceEndpointInstanceID;
            this.sourceEndpointInstanceType = response.sourceEndpointInstanceType;
            this.sourceEndpointOracleSID = response.sourceEndpointOracleSID;
            this.sourceEndpointPassword = response.sourceEndpointPassword;
            this.sourceEndpointPort = response.sourceEndpointPort;
            this.sourceEndpointRegion = response.sourceEndpointRegion;
            this.sourceEndpointUserName = response.sourceEndpointUserName;
        } 

        /**
         * DestinationEndpointArchitecture.
         */
        public Builder destinationEndpointArchitecture(String destinationEndpointArchitecture) {
            this.putQueryParameter("DestinationEndpointArchitecture", destinationEndpointArchitecture);
            this.destinationEndpointArchitecture = destinationEndpointArchitecture;
            return this;
        }

        /**
         * DestinationEndpointDatabaseName.
         */
        public Builder destinationEndpointDatabaseName(String destinationEndpointDatabaseName) {
            this.putQueryParameter("DestinationEndpointDatabaseName", destinationEndpointDatabaseName);
            this.destinationEndpointDatabaseName = destinationEndpointDatabaseName;
            return this;
        }

        /**
         * DestinationEndpointEngineName.
         */
        public Builder destinationEndpointEngineName(String destinationEndpointEngineName) {
            this.putQueryParameter("DestinationEndpointEngineName", destinationEndpointEngineName);
            this.destinationEndpointEngineName = destinationEndpointEngineName;
            return this;
        }

        /**
         * DestinationEndpointIP.
         */
        public Builder destinationEndpointIP(String destinationEndpointIP) {
            this.putQueryParameter("DestinationEndpointIP", destinationEndpointIP);
            this.destinationEndpointIP = destinationEndpointIP;
            return this;
        }

        /**
         * DestinationEndpointInstanceID.
         */
        public Builder destinationEndpointInstanceID(String destinationEndpointInstanceID) {
            this.putQueryParameter("DestinationEndpointInstanceID", destinationEndpointInstanceID);
            this.destinationEndpointInstanceID = destinationEndpointInstanceID;
            return this;
        }

        /**
         * DestinationEndpointInstanceType.
         */
        public Builder destinationEndpointInstanceType(String destinationEndpointInstanceType) {
            this.putQueryParameter("DestinationEndpointInstanceType", destinationEndpointInstanceType);
            this.destinationEndpointInstanceType = destinationEndpointInstanceType;
            return this;
        }

        /**
         * DestinationEndpointOracleSID.
         */
        public Builder destinationEndpointOracleSID(String destinationEndpointOracleSID) {
            this.putQueryParameter("DestinationEndpointOracleSID", destinationEndpointOracleSID);
            this.destinationEndpointOracleSID = destinationEndpointOracleSID;
            return this;
        }

        /**
         * DestinationEndpointPassword.
         */
        public Builder destinationEndpointPassword(String destinationEndpointPassword) {
            this.putQueryParameter("DestinationEndpointPassword", destinationEndpointPassword);
            this.destinationEndpointPassword = destinationEndpointPassword;
            return this;
        }

        /**
         * DestinationEndpointPort.
         */
        public Builder destinationEndpointPort(String destinationEndpointPort) {
            this.putQueryParameter("DestinationEndpointPort", destinationEndpointPort);
            this.destinationEndpointPort = destinationEndpointPort;
            return this;
        }

        /**
         * DestinationEndpointRegion.
         */
        public Builder destinationEndpointRegion(String destinationEndpointRegion) {
            this.putQueryParameter("DestinationEndpointRegion", destinationEndpointRegion);
            this.destinationEndpointRegion = destinationEndpointRegion;
            return this;
        }

        /**
         * DestinationEndpointUserName.
         */
        public Builder destinationEndpointUserName(String destinationEndpointUserName) {
            this.putQueryParameter("DestinationEndpointUserName", destinationEndpointUserName);
            this.destinationEndpointUserName = destinationEndpointUserName;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SourceEndpointArchitecture.
         */
        public Builder sourceEndpointArchitecture(String sourceEndpointArchitecture) {
            this.putQueryParameter("SourceEndpointArchitecture", sourceEndpointArchitecture);
            this.sourceEndpointArchitecture = sourceEndpointArchitecture;
            return this;
        }

        /**
         * SourceEndpointDatabaseName.
         */
        public Builder sourceEndpointDatabaseName(String sourceEndpointDatabaseName) {
            this.putQueryParameter("SourceEndpointDatabaseName", sourceEndpointDatabaseName);
            this.sourceEndpointDatabaseName = sourceEndpointDatabaseName;
            return this;
        }

        /**
         * SourceEndpointEngineName.
         */
        public Builder sourceEndpointEngineName(String sourceEndpointEngineName) {
            this.putQueryParameter("SourceEndpointEngineName", sourceEndpointEngineName);
            this.sourceEndpointEngineName = sourceEndpointEngineName;
            return this;
        }

        /**
         * SourceEndpointIP.
         */
        public Builder sourceEndpointIP(String sourceEndpointIP) {
            this.putQueryParameter("SourceEndpointIP", sourceEndpointIP);
            this.sourceEndpointIP = sourceEndpointIP;
            return this;
        }

        /**
         * SourceEndpointInstanceID.
         */
        public Builder sourceEndpointInstanceID(String sourceEndpointInstanceID) {
            this.putQueryParameter("SourceEndpointInstanceID", sourceEndpointInstanceID);
            this.sourceEndpointInstanceID = sourceEndpointInstanceID;
            return this;
        }

        /**
         * SourceEndpointInstanceType.
         */
        public Builder sourceEndpointInstanceType(String sourceEndpointInstanceType) {
            this.putQueryParameter("SourceEndpointInstanceType", sourceEndpointInstanceType);
            this.sourceEndpointInstanceType = sourceEndpointInstanceType;
            return this;
        }

        /**
         * SourceEndpointOracleSID.
         */
        public Builder sourceEndpointOracleSID(String sourceEndpointOracleSID) {
            this.putQueryParameter("SourceEndpointOracleSID", sourceEndpointOracleSID);
            this.sourceEndpointOracleSID = sourceEndpointOracleSID;
            return this;
        }

        /**
         * SourceEndpointPassword.
         */
        public Builder sourceEndpointPassword(String sourceEndpointPassword) {
            this.putQueryParameter("SourceEndpointPassword", sourceEndpointPassword);
            this.sourceEndpointPassword = sourceEndpointPassword;
            return this;
        }

        /**
         * SourceEndpointPort.
         */
        public Builder sourceEndpointPort(String sourceEndpointPort) {
            this.putQueryParameter("SourceEndpointPort", sourceEndpointPort);
            this.sourceEndpointPort = sourceEndpointPort;
            return this;
        }

        /**
         * SourceEndpointRegion.
         */
        public Builder sourceEndpointRegion(String sourceEndpointRegion) {
            this.putQueryParameter("SourceEndpointRegion", sourceEndpointRegion);
            this.sourceEndpointRegion = sourceEndpointRegion;
            return this;
        }

        /**
         * SourceEndpointUserName.
         */
        public Builder sourceEndpointUserName(String sourceEndpointUserName) {
            this.putQueryParameter("SourceEndpointUserName", sourceEndpointUserName);
            this.sourceEndpointUserName = sourceEndpointUserName;
            return this;
        }

        @Override
        public DescribeConnectionStatusRequest build() {
            return new DescribeConnectionStatusRequest(this);
        } 

    } 

}
