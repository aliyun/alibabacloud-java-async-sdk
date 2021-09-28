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
    @NameInMap("ID")
    private String ID;

    @NameInMap("PrefixSet")
    private ReplicationPrefixSet prefixSet;

    @NameInMap("Action")
    private String action;

    @NameInMap("Destination")
    private ReplicationDestination destination;

    @NameInMap("HistoricalObjectReplication")
    private String historicalObjectReplication;

    @NameInMap("SyncRole")
    private String syncRole;

    @NameInMap("SourceSelectionCriteria")
    private ReplicationSourceSelectionCriteria sourceSelectionCriteria;

    @NameInMap("EncryptionConfiguration")
    private EncryptionConfiguration encryptionConfiguration;


    private ReplicationRule(Builder builder) {
        this.ID = builder.ID;
        this.prefixSet = builder.prefixSet;
        this.action = builder.action;
        this.destination = builder.destination;
        this.historicalObjectReplication = builder.historicalObjectReplication;
        this.syncRole = builder.syncRole;
        this.sourceSelectionCriteria = builder.sourceSelectionCriteria;
        this.encryptionConfiguration = builder.encryptionConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReplicationRule create() {
        return builder().build();
    }

    /**
     * @return ID
     */
    public String ID() {
        return this.ID;
    }

    /**
     * @return prefixSet
     */
    public ReplicationPrefixSet prefixSet() {
        return this.prefixSet;
    }

    /**
     * @return action
     */
    public String action() {
        return this.action;
    }

    /**
     * @return destination
     */
    public ReplicationDestination destination() {
        return this.destination;
    }

    /**
     * @return historicalObjectReplication
     */
    public String historicalObjectReplication() {
        return this.historicalObjectReplication;
    }

    /**
     * @return syncRole
     */
    public String syncRole() {
        return this.syncRole;
    }

    /**
     * @return sourceSelectionCriteria
     */
    public ReplicationSourceSelectionCriteria sourceSelectionCriteria() {
        return this.sourceSelectionCriteria;
    }

    /**
     * @return encryptionConfiguration
     */
    public EncryptionConfiguration encryptionConfiguration() {
        return this.encryptionConfiguration;
    }

    public static final class Builder {
        private String ID; 
        private ReplicationPrefixSet prefixSet; 
        private String action; 
        private ReplicationDestination destination; 
        private String historicalObjectReplication; 
        private String syncRole; 
        private ReplicationSourceSelectionCriteria sourceSelectionCriteria; 
        private EncryptionConfiguration encryptionConfiguration; 

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
         * <p>A short description of HistoricalObjectReplication</p>
         */
        public Builder historicalObjectReplication(String historicalObjectReplication) {
            this.historicalObjectReplication = historicalObjectReplication;
            return this;
        }

        /**
         * <p>A short description of SyncRole</p>
         */
        public Builder syncRole(String syncRole) {
            this.syncRole = syncRole;
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
         * <p>A short description of EncryptionConfiguration</p>
         */
        public Builder encryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
            this.encryptionConfiguration = encryptionConfiguration;
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
        public String replicaKmsKeyID() {
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
