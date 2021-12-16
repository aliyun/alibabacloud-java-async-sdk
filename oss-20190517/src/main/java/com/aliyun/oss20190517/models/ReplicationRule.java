// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ReplicationRule} extends {@link TeaModel}
 *
 * <p>ReplicationRule</p>
 */
public class ReplicationRule extends TeaModel {
    @NameInMap("Action")
    private String action;

    @NameInMap("Destination")
    private ReplicationDestination destination;

    @NameInMap("EncryptionConfiguration")
    private EncryptionConfiguration encryptionConfiguration;

    @NameInMap("HistoricalObjectReplication")
    private String historicalObjectReplication;

    @NameInMap("ID")
    private String ID;

    @NameInMap("PrefixSet")
    private ReplicationPrefixSet prefixSet;

    @NameInMap("SourceSelectionCriteria")
    private ReplicationSourceSelectionCriteria sourceSelectionCriteria;

    @NameInMap("Status")
    private String status;

    @NameInMap("SyncRole")
    private String syncRole;


    private ReplicationRule(Builder builder) {
        this.action = builder.action;
        this.destination = builder.destination;
        this.encryptionConfiguration = builder.encryptionConfiguration;
        this.historicalObjectReplication = builder.historicalObjectReplication;
        this.ID = builder.ID;
        this.prefixSet = builder.prefixSet;
        this.sourceSelectionCriteria = builder.sourceSelectionCriteria;
        this.status = builder.status;
        this.syncRole = builder.syncRole;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReplicationRule create() {
        return builder().build();
    }

    /**
     * @return action
     */
    public String getAction() {
        return this.action;
    }

    /**
     * @return destination
     */
    public ReplicationDestination getDestination() {
        return this.destination;
    }

    /**
     * @return encryptionConfiguration
     */
    public EncryptionConfiguration getEncryptionConfiguration() {
        return this.encryptionConfiguration;
    }

    /**
     * @return historicalObjectReplication
     */
    public String getHistoricalObjectReplication() {
        return this.historicalObjectReplication;
    }

    /**
     * @return ID
     */
    public String getID() {
        return this.ID;
    }

    /**
     * @return prefixSet
     */
    public ReplicationPrefixSet getPrefixSet() {
        return this.prefixSet;
    }

    /**
     * @return sourceSelectionCriteria
     */
    public ReplicationSourceSelectionCriteria getSourceSelectionCriteria() {
        return this.sourceSelectionCriteria;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return syncRole
     */
    public String getSyncRole() {
        return this.syncRole;
    }

    public static final class Builder {
        private String action; 
        private ReplicationDestination destination; 
        private EncryptionConfiguration encryptionConfiguration; 
        private String historicalObjectReplication; 
        private String ID; 
        private ReplicationPrefixSet prefixSet; 
        private ReplicationSourceSelectionCriteria sourceSelectionCriteria; 
        private String status; 
        private String syncRole; 

        /**
         * <p>A short description of action</p>
         */
        public Builder action(String action) {
            this.action = action;
            return this;
        }

        /**
         * <p>Destination.</p>
         */
        public Builder destination(ReplicationDestination destination) {
            this.destination = destination;
            return this;
        }

        /**
         * <p>A short description of EncryptionConfiguration</p>
         */
        public Builder encryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
            this.encryptionConfiguration = encryptionConfiguration;
            return this;
        }

        /**
         * <p>A short description of HistoricalObjectReplication</p>
         */
        public Builder historicalObjectReplication(String historicalObjectReplication) {
            this.historicalObjectReplication = historicalObjectReplication;
            return this;
        }

        /**
         * <p>rule id</p>
         */
        public Builder ID(String ID) {
            this.ID = ID;
            return this;
        }

        /**
         * <p>PrefixSet.</p>
         */
        public Builder prefixSet(ReplicationPrefixSet prefixSet) {
            this.prefixSet = prefixSet;
            return this;
        }

        /**
         * <p>SourceSelectionCriteria.</p>
         */
        public Builder sourceSelectionCriteria(ReplicationSourceSelectionCriteria sourceSelectionCriteria) {
            this.sourceSelectionCriteria = sourceSelectionCriteria;
            return this;
        }

        /**
         * <p>A short description of action</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>A short description of SyncRole</p>
         */
        public Builder syncRole(String syncRole) {
            this.syncRole = syncRole;
            return this;
        }

        public ReplicationRule build() {
            return new ReplicationRule(this);
        } 

    } 

    public static class EncryptionConfiguration extends TeaModel {
        @NameInMap("ReplicaKmsKeyID")
        private String replicaKmsKeyID;


        private EncryptionConfiguration(Builder builder) {
            this.replicaKmsKeyID = builder.replicaKmsKeyID;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EncryptionConfiguration create() {
            return builder().build();
        }

        /**
         * @return replicaKmsKeyID
         */
        public String getReplicaKmsKeyID() {
            return this.replicaKmsKeyID;
        }

        public static final class Builder {
            private String replicaKmsKeyID; 

            /**
             * <p>kms id</p>
             */
            public Builder replicaKmsKeyID(String replicaKmsKeyID) {
                this.replicaKmsKeyID = replicaKmsKeyID;
                return this;
            }

            public EncryptionConfiguration build() {
                return new EncryptionConfiguration(this);
            } 

        } 

    }
}
